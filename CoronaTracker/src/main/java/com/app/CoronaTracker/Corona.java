package com.app.CoronaTracker;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder



public class Corona {
	
	String combinedKey;
	Long active;
	Long recovered;
	Long confirmed;
	LocalDateTime lastUpdate;
	

}
