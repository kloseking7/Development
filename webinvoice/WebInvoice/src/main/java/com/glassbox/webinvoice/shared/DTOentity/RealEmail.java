package com.glassbox.webinvoice.shared.DTOentity;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class RealEmail
{
	private List<String> receipients = new ArrayList<String>();
	private String subject;
	private String content;
	private Collection<File> attachFiles = new ArrayList<File>();

	public Collection<File> getAttachFiles()
	{
		return attachFiles;
	}

	public void setAttachFiles(Collection<File> attachFiles)
	{
		this.attachFiles = attachFiles;
	}

	public List<String> getReceipients()
	{
		return receipients;
	}

	public void setReceipients(List<String> receipient)
	{
		this.receipients = receipient;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public void addReipien(String reci)
	{
		this.receipients.add(reci);
	}

	public void addFile(File file)
	{
		this.attachFiles.add(file);
	}

}
