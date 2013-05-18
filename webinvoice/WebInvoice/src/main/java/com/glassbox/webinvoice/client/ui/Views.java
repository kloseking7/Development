package com.glassbox.webinvoice.client.ui;

public enum Views {
	Home("Home"), SignIn("Sign In"), SignUp("Sign Up"), CheckClient(
			"Check Client"), ManageInvoice("Manage Invoices"), Logout("Log out");

	private String pageName;

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	private Views(String pageName) {
		this.pageName = pageName;
	}

}
