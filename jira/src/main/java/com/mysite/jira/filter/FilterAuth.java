package com.mysite.jira.filter;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.mysite.jira.account.Account;
import com.mysite.jira.group.Jira;
import com.mysite.jira.project.Project;
import com.mysite.jira.team.Team;

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
public class FilterAuth {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filterAuth_seq")
	@SequenceGenerator(name = "filterAuth_seq", sequenceName = "filterAuth_seq", allocationSize = 1)
	private Integer idx; 
	
	@Column
	private Integer type;
	
	@Column
	private Integer projectRole;
	
	@ManyToOne
	private Filter filter;
	
	@ManyToOne
	private Project project;
	
	@ManyToOne
	private Account account;
	
	@ManyToOne
	private Team team;
	
	
	

}
