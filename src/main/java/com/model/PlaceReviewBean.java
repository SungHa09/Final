package com.model;

import java.sql.Timestamp;
import org.apache.ibatis.type.Alias;
import lombok.Data;

@Data
@Alias("placereview")
public class PlaceReviewBean {

	private int place_rev_id;
	private String rev_title;
	private String rev_content;
	private String rev_photo;
	private Timestamp rev_reg;
	private int rev_rate;
	private int rev_like;
	private int place_id;
	private String id;

}
