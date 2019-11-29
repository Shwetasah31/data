package test;

import java.util.Date;

public class IssueRecord{
	
	int id;
	int copyid;
	int memberid;
	Date issue_date;
	Date return_duedate;
	Date return_date;
	float fine_amount;
	
	
	public IssueRecord() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCopyid() {
		return copyid;
	}


	public void setCopyid(int copyid) {
		this.copyid = copyid;
	}


	public int getMemberid() {
		return memberid;
	}


	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}


	public Date getIssue_date() {
		return issue_date;
	}


	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}


	public Date getReturn_duedate() {
		return return_duedate;
	}


	public void setReturn_duedate(Date return_duedate) {
		this.return_duedate = return_duedate;
	}


	public Date getReturn_date() {
		return return_date;
	}


	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}


	public float getFine_amount() {
		return fine_amount;
	}


	public void setFine_amount(float fine_amount) {
		this.fine_amount = fine_amount;
	}


	public IssueRecord(int id, int copyid, int memberid, Date issue_date, Date return_duedate, Date return_date,
			float fine_amount) {
		
		this.id = id;
		this.copyid = copyid;
		this.memberid = memberid;
		this.issue_date = issue_date;
		this.return_duedate = return_duedate;
		this.return_date = return_date;
		this.fine_amount = fine_amount;
	}

	
	
	
}
