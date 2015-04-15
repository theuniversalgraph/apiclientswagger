package io.swagger.client.model;

import java.util.*;
import io.swagger.client.model.NodeDto;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class NodeDto  {
  
  private List<NodeDto> children = new ArrayList<NodeDto>() ;
  private Integer x = null;
  private Integer width = null;
  private Integer y = null;
  private String id = null;
  private String content = null;
  private String contenttype = null;
  private List<NodeDto> parents = new ArrayList<NodeDto>() ;
  private Integer height = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  public List<NodeDto> getChildren() {
    return children;
  }
  public void setChildren(List<NodeDto> children) {
    this.children = children;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contenttype")
  public String getContenttype() {
    return contenttype;
  }
  public void setContenttype(String contenttype) {
    this.contenttype = contenttype;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parents")
  public List<NodeDto> getParents() {
    return parents;
  }
  public void setParents(List<NodeDto> parents) {
    this.parents = parents;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDto {\n");
    
    sb.append("  children: ").append(children).append("\n");
    sb.append("  x: ").append(x).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  y: ").append(y).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  contenttype: ").append(contenttype).append("\n");
    sb.append("  parents: ").append(parents).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
