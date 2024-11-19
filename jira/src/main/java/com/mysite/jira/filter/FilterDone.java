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

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FilterDone {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filterDone_seq")
	@SequenceGenerator(name = "filterDone_seq", sequenceName = "filterDone_seq", allocationSize = 1)
	private Integer idx;
	
	@ManyToOne
	private Filter filter;
	
	@ColumnDefault("0")
	@Min(0)
	@Max(1)
	private Integer	isConpleted;
}
