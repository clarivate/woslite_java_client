/*
 * Web of Science API Lite
 * A responsive API that supports rich searching across the Web of Science Core Collection to retrieve core article metadata.  This service provides a great way to reuse Web of Science data both internally and externally to enhance  institutional repositories and research networking systems with best-in-class data. This API supports searching across the Web of Science to retrieve item-level metadata with limited fields:  - UT (Unique Identifier) - Authors - Author keywords - Document type - Title - Issue - Pages - Publication date - Source title - Volume - DOI - ISBN - ISSN   The API supports JSON and XML responses, and this documentation supports trying both response types. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clarivate.woslite.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * The source authors
 */
@ApiModel(description = "The source authors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T10:06:41.554+02:00[Europe/Berlin]")
public class Author {
  public static final String SERIALIZED_NAME_AUTHORS = "Authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<String> authors = null;

  public static final String SERIALIZED_NAME_BOOK_AUTHORS = "BookAuthors";
  @SerializedName(SERIALIZED_NAME_BOOK_AUTHORS)
  private List<String> bookAuthors = null;

  public static final String SERIALIZED_NAME_BOOK_GROUP_AUTHORS = "BookGroupAuthors";
  @SerializedName(SERIALIZED_NAME_BOOK_GROUP_AUTHORS)
  private List<String> bookGroupAuthors = null;


  public Author authors(List<String> authors) {
    
    this.authors = authors;
    return this;
  }

  public Author addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Get authors
   * @return authors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Bashir, Saqib\",\"Salam, Abdus\",\"Chhajro, Muhammad Afzal\",\"Fu, Qingling\",\"Khan, Muhammad Jamal\",\"Zhu, Jun\",\"Shaaban, Muhammad\",\"Kubar, Kashif Ali\",\"Ali, Umeed\",\"Hu, Hongqing\"]", value = "")

  public List<String> getAuthors() {
    return authors;
  }


  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }


  public Author bookAuthors(List<String> bookAuthors) {
    
    this.bookAuthors = bookAuthors;
    return this;
  }

  public Author addBookAuthorsItem(String bookAuthorsItem) {
    if (this.bookAuthors == null) {
      this.bookAuthors = new ArrayList<String>();
    }
    this.bookAuthors.add(bookAuthorsItem);
    return this;
  }

   /**
   * Get bookAuthors
   * @return bookAuthors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Miller, DS\",\"Rivera, JD\"]", value = "")

  public List<String> getBookAuthors() {
    return bookAuthors;
  }


  public void setBookAuthors(List<String> bookAuthors) {
    this.bookAuthors = bookAuthors;
  }


  public Author bookGroupAuthors(List<String> bookGroupAuthors) {
    
    this.bookGroupAuthors = bookGroupAuthors;
    return this;
  }

  public Author addBookGroupAuthorsItem(String bookGroupAuthorsItem) {
    if (this.bookGroupAuthors == null) {
      this.bookGroupAuthors = new ArrayList<String>();
    }
    this.bookGroupAuthors.add(bookGroupAuthorsItem);
    return this;
  }

   /**
   * Book authors if In case of a book series
   * @return bookGroupAuthors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Book authors if In case of a book series")

  public List<String> getBookGroupAuthors() {
    return bookGroupAuthors;
  }


  public void setBookGroupAuthors(List<String> bookGroupAuthors) {
    this.bookGroupAuthors = bookGroupAuthors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.authors, author.authors) &&
        Objects.equals(this.bookAuthors, author.bookAuthors) &&
        Objects.equals(this.bookGroupAuthors, author.bookGroupAuthors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, bookAuthors, bookGroupAuthors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    bookAuthors: ").append(toIndentedString(bookAuthors)).append("\n");
    sb.append("    bookGroupAuthors: ").append(toIndentedString(bookGroupAuthors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

