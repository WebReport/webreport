package webreport.objects;

/*
        WebReport - A modern solution for handling in-game reports on the web.
        Copyright (C) 2021  Cold-Dev

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU Affero General Public License as published
        by the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU Affero General Public License for more details.

        You should have received a copy of the GNU Affero General Public License
        along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

import org.bukkit.entity.Player;

public class Report {

    private Player snitch;
    private Player reported;
    private String reason;
    private String reportID;
    private boolean resolved;

    public Report(Player snitch, Player reported, String reason, String reportID, boolean resolved) {
        this.snitch = snitch;
        this.reported = reported;
        this.reason = reason;
        this.reportID = reportID;
        this.resolved = resolved;
    }

    public Player getSnitch() {
        return snitch;
    }

    public Player getReported() {
        return reported;
    }

    public String getReason() {
        return reason;
    }

    public String getReportID() {
        return reportID;
    }

    public void resolve() {
        this.resolved = true;
    }

}
