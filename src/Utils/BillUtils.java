/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Controller.BeverageController;
import Controller.UserController;
import Model.BeverageModel;
import Model.BillDetailModel;
import Model.BillModel;
import Model.UserModel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author asus
 */
public class BillUtils implements Printable {

    private double bHeight;
    private BillModel billModel;
    private UserModel userModel;
    private List<BeverageModel> beverageModel;
    private ImageObserver rootPane;
    private BeverageController beverageController = new BeverageController();
    private UserController userController = new UserController();

    public BillUtils() {
        bHeight = 0.0;
    }

    public BillUtils(BillModel model, ImageObserver rootPane) {
        setBill(model, rootPane);
    }

    public final void setBill(BillModel model, ImageObserver rootPane) {
        this.rootPane = rootPane;
        billModel = new BillModel();
        billModel.setId(model.getId());
        billModel.setBeverages(model.getBeverages());
        billModel.setCash(model.getCash());
        billModel.setChangeMoney(model.getChangeMoney());
        billModel.setCreateTime(model.getCreateTime());
        billModel.setDiscount(model.getDiscount());
        billModel.setCreatorId(model.getCreatorId());
        billModel.setSubtotal(model.getSubtotal());
        billModel.setTotal(model.getTotal());
        billModel.setTotalAmount(model.getTotalAmount());
        getDetails();
    }

    public void getDetails() {
        userModel = new UserModel();
        beverageModel = new ArrayList<>();
        for (BillDetailModel item : billModel.getBeverages()) {
            BeverageModel model = new BeverageModel();
            model = beverageController.get(item.getBeverageId());
            beverageModel.add(model);
        }
        userModel = userController.get(billModel.getCreatorId());
        bHeight = (double) beverageModel.size();
    }

    public PageFormat getPageFormat(PrinterJob pj) {
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 5.0;
        double width = cmToPPI(8);
        double height = cmToPPI(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cmToPPI(1));

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    protected static double cmToPPI(double cm) {
        return inchToPPI(cm * 0.393600787);
    }

    protected static double inchToPPI(double inch) {
        return inch * 72d;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        int r = beverageModel.size();

        ImageIcon icon = new ImageIcon("\\src\\images\\logo.png");
        int result = NO_SUCH_PAGE;
        if (pageIndex == 0) {

            Graphics2D g2d = (Graphics2D) graphics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

            try {
                int y = 18;
                int yShift = 8;
                int headerRectHeight = 15;

                g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                g2d.drawImage(icon.getImage(), 70, 20, 90, 30, rootPane);

                y += yShift + 30;
                g2d.drawString("-------------------------------------", 12, y);
                y += yShift;
                g2d.drawString("              KAT COFEE        ", 12, y);
                y += yShift;
                g2d.drawString("       No 002 Address Line One      ", 12, y);
                y += yShift;
                g2d.drawString("     Address Line In We Universal ", 12, y);
                y += yShift;
                g2d.drawString("       www.facebook.com/Coffee ", 12, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 12, y);
                y += headerRectHeight;
                y += yShift;
                g2d.drawString(" Người tạo: " + userModel.getUsername(), 12, y);
                y += yShift;
                g2d.drawString(" Ngày tạo : " + billModel.getCreateTime(), 12, y);
                y += yShift;
                y += yShift;
                g2d.drawString(" Item Name               Price   ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += headerRectHeight;

                for (int i = 0; i < r; i++) {
                    g2d.drawString(" " + beverageModel.get(i).getName() + "                            ", 10, y);
                    y += yShift;
                    g2d.drawString("    " + billModel.getBeverages().get(i).getAmount() + " * " + beverageModel.get(i).getPrice(), 10, y);
                    g2d.drawString("                         " + (billModel.getBeverages().get(i).getAmount() * beverageModel.get(i).getPrice()) + "VNĐ", 10, y);
                    y += yShift;

                }

                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Tổng Số Lượng    :      " + Integer.toString(billModel.getTotalAmount()) + "   ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Tổng tiền hoá đơn:      " + Float.toString(billModel.getSubtotal()) + " VNĐ  ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Khuyến mãi       :      " + Float.toString(billModel.getDiscount() * 100) + "%  ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Cash             :      " + Float.toString(billModel.getCash()) + " VNĐ  ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Change           :      " + Float.toString(billModel.getChangeMoney()) + " VNĐ  ", 10, y);
                y += yShift;
                g2d.drawString("*************************************", 10, y);
                y += yShift;
                g2d.drawString("         THANK YOU COME AGAIN            ", 10, y);
                y += yShift;
                g2d.drawString("*************************************", 10, y);
                y += yShift;
                g2d.drawString("                JAVA          ", 10, y);
                y += yShift;
                g2d.drawString("CONTACT:locb1704748@student.ctu.edu.vn     ", 10, y);
                y += yShift;

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            result = PAGE_EXISTS;
        }
        return result;
    }
}
