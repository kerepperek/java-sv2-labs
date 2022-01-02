package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] temp = s.split(";");
            int pcs = Integer.parseInt(temp[2]);
            int price = Integer.parseInt(temp[1]);
            sb.append(temp[0]).append(String.format(", %d * %d = %d Ft", pcs, price, (pcs * price))).append("\n");
        }
        return sb.toString();
    }
}
