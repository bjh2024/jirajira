package com.mysite.jira.filter;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.OnDelete;

import com.mysite.jira.account.Account;
import com.mysite.jira.dashboard.Dashboard;
import com.mysite.jira.group.Jira;
import com.mysite.jira.issue.IssuePriority;
import com.mysite.jira.issue.IssueStatus;
import com.mysite.jira.issue.IssueType;
import com.mysite.jira.project.Project;
import com.mysite.jira.team.Team;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filter_seq")
	@SequenceGenerator(name = "filter_seq", sequenceName = "filter_seq", allocationSize = 1)
	private Integer idx; 
	
	@Column(columnDefinition = "VARCHAR2(500)")
	private String name;
	
	@Column(columnDefinition = "VARCHAR2(4000)")
	private String explain;
	
	@ManyToOne
	private Account account;
	
	@ManyToOne
	private Jira jira;
	
	@OneToMany(mappedBy = "filter",orphanRemoval = true) 
	private List<FilterAuth> filterAuthList;
	
	@OneToMany(mappedBy = "filter",orphanRemoval = true) 
	private List<FilterDoneDate> filterDoneDateList;
	
	@OneToMany(mappedBy = "filter",orphanRemoval = true) 
	private List<FilterDone> filterDoneList;
	
	@OneToMany(mappedBy = "filter",orphanRemoval = true) 
	private List<FilterIssueUpdate> filterIssueUpdateList;
	
	
	
	@ManyToMany
	Set<Project> Project;
	
	@ManyToMany
	Set<IssueType> IssueType;
	
	@ManyToMany
	Set<IssueStatus> IssueStatus;
	
	@ManyToMany
	Set<Account> Manage;
	
	@ManyToMany
	Set<IssuePriority> IssuePriority;
	
	@ManyToMany
	Set<Account> likeMembers;
	
	@ManyToMany
	Set<IssueStatus> statusDefault;
	
	@ManyToMany
	Set<Account> reporter;
	
}
