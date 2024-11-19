package com.mysite.jira.team;

import java.util.List;
import java.util.Set;

import com.mysite.jira.account.Account;
import com.mysite.jira.dashboard.DashboardAuth;
import com.mysite.jira.filter.FilterAuth;
import com.mysite.jira.group.Jira;

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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_seq")
	@SequenceGenerator(name = "team_seq", sequenceName = "team_seq", allocationSize = 1)
	private Integer idx; 
	
	@Column(columnDefinition = "VARCHAR2(100)")
	@NotNull
	private String name;
	
	@ManyToOne
	private Jira jira;
	
	@ManyToOne
	private Account account;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.REMOVE)
	private List<DashboardAuth> DashboardAuthList;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.REMOVE)
	private List<FilterAuth> filterAuthList;
	
	@ManyToMany
	Set<Account> members;
	
}
