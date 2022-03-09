package com.stockAPI.model.line_notify_api;

import java.awt.Image;

import lombok.Data;

@Data
public class LineNotify  {
	
	private String message;
	
	private String imageThumbnail;
	
	private Integer imageFullsize;
	
	private Image imageFile;
	
	private Integer stickerPackageId;
	
	private Integer stickerId;
	
	
	
	public LineNotify(String message) {
		this.message = message;
	}
	
}
