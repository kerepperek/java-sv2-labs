package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries= new ArrayList<>();

    public NameServer() {
    }

    private class DnsEntry {

        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }
    private DnsEntry getByName(String name) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(name)) {
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry getByIp(String ip) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(ip)) {
                return dnsEntry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public void addEntry(String hostName, String hostIp) {
        if (hasName(hostName) || hasIp(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String name) {
        if (hasName(name)) {
            DnsEntry entry = getByName(name);
            this.dnsEntries.remove(entry);
        }
    }

    public void removeEntryByIp(String ip) {
        if (hasIp(ip)) {
            DnsEntry entry = getByIp(ip);
            this.dnsEntries.remove(entry);
        }
    }

    public String getIpByName(String name) {
        DnsEntry entry = getByName(name);
        return entry.hostIp;
    }

    public String getNameByIp(String ip) {
        DnsEntry entry = getByIp(ip);
        return entry.hostName;
    }

    private boolean hasName(String name) {
        for (DnsEntry entry : dnsEntries) {
            if (entry.hostName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasIp(String ip) {
        for (DnsEntry entry : dnsEntries) {
            if (entry.hostIp.equals(ip)) {
                return true;
            }
        }
        return false;
    }




}
