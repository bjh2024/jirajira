package com.mysite.jira.filter;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ColumnDefault;

import com.mysite.jira.account.Account;
import com.mysite.jira.group.Jira;
import com.mysite.jira.issue.IssuePriority;
import com.mysite.jira.issue.IssueStatus;
import com.mysite.jira.issue.IssueType;
import com.mysite.jira.project.Project;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FilterDoneDate {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FilterDoneDate_seq")
	@SequenceGenerator(name = "FilterDoneDate_seq", sequenceName = "FilterDoneDate_seq", allocationSize = 1)
	private Integer idx; 
	
	@ManyToOne
	private Filter filter;
	
	@ColumnDefault("30")
	@NotNull
	private Integer deadline;

}
