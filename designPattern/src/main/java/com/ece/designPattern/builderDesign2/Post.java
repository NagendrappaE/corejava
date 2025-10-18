package com.ece.designPattern.builderDesign2;

public class Post {

	private String title;
	private String text;
	private String catagory;

	public Post(Builder builder) {

		this.title = builder.title;
		this.text = builder.text;
		this.catagory = builder.category;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public static class Builder {

		private String title;
		private String text;
		private String category;

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder text(String text) {
			this.text = text;
			return this;
		}

		public Builder category(String category) {
			this.category = category;
			return this;
		}

		public Post build() {
			return new Post(this);
		}

	}

}
