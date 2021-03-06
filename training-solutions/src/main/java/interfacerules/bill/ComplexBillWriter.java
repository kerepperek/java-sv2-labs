package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] temp = s.split(";");
            int pieces = Integer.parseInt(temp[2]);
            int price = Integer.parseInt(temp[1]);
            sb.append( temp[0]).append(String.format("; darabszám: %d, egységár: %d, összesen: %d Ft", pieces, price, (pieces * price))).append("\n");
        }
        return sb.toString();
    }
}
