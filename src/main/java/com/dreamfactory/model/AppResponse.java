package com.dreamfactory.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class AppResponse {
  /* Identifier of this application. */
  @JsonProperty("id")
  private Integer id = null;
  /* Displayable name of this application. */
  @JsonProperty("name")
  private String name = null;
  /* Name of the application to use in API transactions. */
  @JsonProperty("api_name")
  private String api_name = null;
  /* Description of this application. */
  @JsonProperty("description")
  private String description = null;
  /* Is this system application active for use. */
  @JsonProperty("is_active")
  private Boolean is_active = null;
  /* URL for accessing this application. */
  @JsonProperty("url")
  private String url = null;
  /* True when this application is hosted elsewhere, but available in Launchpad. */
  @JsonProperty("is_url_external")
  private Boolean is_url_external = null;
  /* If hosted and imported, the url of zip or package file where the code originated. */
  @JsonProperty("import_url")
  private String import_url = null;
  /* If hosted, the storage service identifier. */
  @JsonProperty("storage_service_id")
  private String storage_service_id = null;
  /* If hosted, the container of the storage service. */
  @JsonProperty("storage_container")
  private String storage_container = null;
  /* True when this app needs to hide launchpad. */
  @JsonProperty("requires_fullscreen")
  private Boolean requires_fullscreen = null;
  /* True to allow launchpad access via toggle. */
  @JsonProperty("allow_fullscreen_toggle")
  private Boolean allow_fullscreen_toggle = null;
  /* Screen location for toggle placement. */
  @JsonProperty("toggle_location")
  private String toggle_location = null;
  /* True when the app relies on a browser plugin. */
  @JsonProperty("requires_plugin")
  private Boolean requires_plugin = null;
  /* Related roles by Role.default_app_id. */
  @JsonProperty("roles_default_app")
  private List<String> roles_default_app = new ArrayList<String>();
  /* Related users by User.default_app_id. */
  @JsonProperty("users_default_app")
  private List<String> users_default_app = new ArrayList<String>();
  /* Related groups by app to group assignment. */
  @JsonProperty("app_groups")
  private List<String> app_groups = new ArrayList<String>();
  /* Related roles by app to role assignment. */
  @JsonProperty("roles")
  private List<String> roles = new ArrayList<String>();
  /* Related services by app to service assignment. */
  @JsonProperty("services")
  private List<String> services = new ArrayList<String>();
  /* Date this application was created. */
  @JsonProperty("created_date")
  private String created_date = null;
  /* User Id of who created this application. */
  @JsonProperty("created_by_id")
  private Integer created_by_id = null;
  /* Date this application was last modified. */
  @JsonProperty("last_modified_date")
  private String last_modified_date = null;
  /* User Id of who last modified this application. */
  @JsonProperty("last_modified_by_id")
  private Integer last_modified_by_id = null;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getApi_name() {
    return api_name;
  }
  public void setApi_name(String api_name) {
    this.api_name = api_name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getIs_active() {
    return is_active;
  }
  public void setIs_active(Boolean is_active) {
    this.is_active = is_active;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public Boolean getIs_url_external() {
    return is_url_external;
  }
  public void setIs_url_external(Boolean is_url_external) {
    this.is_url_external = is_url_external;
  }

  public String getImport_url() {
    return import_url;
  }
  public void setImport_url(String import_url) {
    this.import_url = import_url;
  }

  public String getStorage_service_id() {
    return storage_service_id;
  }
  public void setStorage_service_id(String storage_service_id) {
    this.storage_service_id = storage_service_id;
  }

  public String getStorage_container() {
    return storage_container;
  }
  public void setStorage_container(String storage_container) {
    this.storage_container = storage_container;
  }

  public Boolean getRequires_fullscreen() {
    return requires_fullscreen;
  }
  public void setRequires_fullscreen(Boolean requires_fullscreen) {
    this.requires_fullscreen = requires_fullscreen;
  }

  public Boolean getAllow_fullscreen_toggle() {
    return allow_fullscreen_toggle;
  }
  public void setAllow_fullscreen_toggle(Boolean allow_fullscreen_toggle) {
    this.allow_fullscreen_toggle = allow_fullscreen_toggle;
  }

  public String getToggle_location() {
    return toggle_location;
  }
  public void setToggle_location(String toggle_location) {
    this.toggle_location = toggle_location;
  }

  public Boolean getRequires_plugin() {
    return requires_plugin;
  }
  public void setRequires_plugin(Boolean requires_plugin) {
    this.requires_plugin = requires_plugin;
  }

  public List<String> getRoles_default_app() {
    return roles_default_app;
  }
  public void setRoles_default_app(List<String> roles_default_app) {
    this.roles_default_app = roles_default_app;
  }

  public List<String> getUsers_default_app() {
    return users_default_app;
  }
  public void setUsers_default_app(List<String> users_default_app) {
    this.users_default_app = users_default_app;
  }

  public List<String> getApp_groups() {
    return app_groups;
  }
  public void setApp_groups(List<String> app_groups) {
    this.app_groups = app_groups;
  }

  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public List<String> getServices() {
    return services;
  }
  public void setServices(List<String> services) {
    this.services = services;
  }

  public String getCreated_date() {
    return created_date;
  }
  public void setCreated_date(String created_date) {
    this.created_date = created_date;
  }

  public Integer getCreated_by_id() {
    return created_by_id;
  }
  public void setCreated_by_id(Integer created_by_id) {
    this.created_by_id = created_by_id;
  }

  public String getLast_modified_date() {
    return last_modified_date;
  }
  public void setLast_modified_date(String last_modified_date) {
    this.last_modified_date = last_modified_date;
  }

  public Integer getLast_modified_by_id() {
    return last_modified_by_id;
  }
  public void setLast_modified_by_id(Integer last_modified_by_id) {
    this.last_modified_by_id = last_modified_by_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppResponse {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  api_name: ").append(api_name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  is_active: ").append(is_active).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  is_url_external: ").append(is_url_external).append("\n");
    sb.append("  import_url: ").append(import_url).append("\n");
    sb.append("  storage_service_id: ").append(storage_service_id).append("\n");
    sb.append("  storage_container: ").append(storage_container).append("\n");
    sb.append("  requires_fullscreen: ").append(requires_fullscreen).append("\n");
    sb.append("  allow_fullscreen_toggle: ").append(allow_fullscreen_toggle).append("\n");
    sb.append("  toggle_location: ").append(toggle_location).append("\n");
    sb.append("  requires_plugin: ").append(requires_plugin).append("\n");
    sb.append("  roles_default_app: ").append(roles_default_app).append("\n");
    sb.append("  users_default_app: ").append(users_default_app).append("\n");
    sb.append("  app_groups: ").append(app_groups).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("  created_date: ").append(created_date).append("\n");
    sb.append("  created_by_id: ").append(created_by_id).append("\n");
    sb.append("  last_modified_date: ").append(last_modified_date).append("\n");
    sb.append("  last_modified_by_id: ").append(last_modified_by_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

