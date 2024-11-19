package com.mysite.jira.filter;

import org.hibernate.annotations.ColumnDefault;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
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
public class FilterIssueUpdate {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FilterIssueUpdate_seq")
	@SequenceGenerator(name = "FilterIssueUpdate_seq", sequenceName = "FilterIssueUpdate_seq", allocationSize = 1)
	private Integer idx; 
	
	@ManyToOne
	private Filter filter;
	
	@ColumnDefault("30")
	@NotNull
	private Integer deadline;
}
