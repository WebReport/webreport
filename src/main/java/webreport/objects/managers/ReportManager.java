package webreport.objects.managers;

import webreport.objects.Report;
import webreport.utils.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;

public class ReportManager {

    private static final HashMap<String, Report> reports = new HashMap<>();

    public static void initialize() {
        // Eventually, I'll be adding a GET request to the local API which SHOULD come with the full finished project.
        // For now though, I'll use a test command to ensure that everything is working.
    }

    public static void addReport(Report report) {
        String reportID = StringUtils.randomString(10);
        reports.put(reportID, report);
    }

    public static void removeReport(String reportID) {
        reports.remove(reportID);
    }

    public static Report getReportByID(String reportID) {
        return reports.get(reportID);
    }

    public static HashMap<String, Report> getReports() {
        return reports;
    }

}
