package com.reddit.online.Model;

import com.google.gson.annotations.SerializedName;

public class ChildData {

    @SerializedName("author_flair_background_color")
    private String author_flair_background_color;
    @SerializedName("pwls")
    private int pwls;
    @SerializedName("is_original_content")
    private boolean is_original_content;
    @SerializedName("mod_note")
    private String mod_note;
    @SerializedName("score")
    private String score;
    @SerializedName("subreddit_name_prefixed")
    private String subreddit_name_prefixed;
    @SerializedName("send_replies")
    private boolean send_replies;
    @SerializedName("created_utc")
    private double created_utc;
    @SerializedName("clicked")
    private boolean clicked;
    @SerializedName("mod_reason_by")
    private String mod_reason_by;
    @SerializedName("over_18")
    private boolean over_18;
    @SerializedName("link_flair_template_id")
    private String link_flair_template_id;
    @SerializedName("is_reddit_media_domain")
    private boolean is_reddit_media_domain;
    @SerializedName("created")
    private double created;
    @SerializedName("subreddit_type")
    private String subreddit_type;
    @SerializedName("removal_reason")
    private String removal_reason;
    @SerializedName("secure_media")
    private SecureMedia secure_media;
    @SerializedName("num_reports")
    private String num_reports;
    @SerializedName("stickied")
    private boolean stickied;
    @SerializedName("can_gild")
    private boolean can_gild;
    @SerializedName("contest_mode")
    private boolean contest_mode;
    @SerializedName("author_flair_type")
    private String author_flair_type;
    @SerializedName("link_flair_text")
    private String link_flair_text;
    @SerializedName("saved")
    private boolean saved;
    @SerializedName("subreddit_id")
    private String subreddit_id;
    @SerializedName("distinguished")
    private String distinguished;
    @SerializedName("is_meta")
    private boolean is_meta;
    @SerializedName("url")
    private String url;
    @SerializedName("subreddit")
    private String subreddit;
    @SerializedName("is_self")
    private boolean is_self;
    @SerializedName("num_comments")
    private int num_comments;
    @SerializedName("category")
    private String category;
    @SerializedName("approved_by")
    private String approved_by;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("permalink")
    private String permalink;
    @SerializedName("preview")
    private Preview preview;
    @SerializedName("is_crosspostable")
    private boolean is_crosspostable;
    @SerializedName("likes")
    private String likes;
    @SerializedName("locked")
    private boolean locked;
    @SerializedName("suggested_sort")
    private String suggested_sort;
    @SerializedName("thumbnail_height")
    private String thumbnail_height;
    @SerializedName("link_flair_text_color")
    private String link_flair_text_color;
    @SerializedName("post_hint")
    private String post_hint;
    @SerializedName("author_flair_css_class")
    private String author_flair_css_class;
    @SerializedName("quarantine")
    private boolean quarantine;
    @SerializedName("media_only")
    private boolean media_only;
    @SerializedName("link_flair_background_color")
    private String link_flair_background_color;
    @SerializedName("parent_whitelist_status")
    private String parent_whitelist_status;
    @SerializedName("id")
    private String id;
    @SerializedName("visited")
    private boolean visited;
    @SerializedName("mod_reason_title")
    private String mod_reason_title;
    @SerializedName("is_video")
    private boolean is_video;
    @SerializedName("author")
    private String author;
    @SerializedName("title")
    private String title;
    @SerializedName("thumbnail_width")
    private String thumbnail_width;
    @SerializedName("author_flair_text_color")
    private String author_flair_text_color;
    @SerializedName("archived")
    private boolean archived;
    @SerializedName("pinned")
    private boolean pinned;
    @SerializedName("selftext_html")
    private String selftext_html;
    @SerializedName("name")
    private String name;
    @SerializedName("domain")
    private String domain;
    @SerializedName("author_flair_text")
    private String author_flair_text;
    @SerializedName("can_mod_post")
    private String can_mod_post;
    @SerializedName("edited")
    private String edited;
    @SerializedName("spoiler")
    private boolean spoiler;
    @SerializedName("link_flair_css_class")
    private String link_flair_css_class;
    @SerializedName("num_crossposts")
    private int num_crossposts;
    @SerializedName("hide_score")
    private boolean hide_score;
    @SerializedName("gilded")
    private int gilded;
    @SerializedName("subreddit_subscribers")
    private long subreddit_subscribers;
    @SerializedName("banned_by")
    private String banned_by;
    @SerializedName("link_flair_type")
    private String link_flair_type;
    @SerializedName("hidden")
    private boolean hidden;
    @SerializedName("report_reasons")
    private String report_reasons;
    @SerializedName("wls")
    private int wls;
    @SerializedName("author_flair_template_id")
    private String author_flair_template_id;
    @SerializedName("banned_at_utc")
    private String banned_at_utc;
    @SerializedName("downs")
    private int downs;
    @SerializedName("whitelist_status")
    private String whitelist_status;
    @SerializedName("no_follow")
    private boolean no_follow;
    @SerializedName("view_count")
    private String view_count;
    @SerializedName("ups")
    private int ups;
    @SerializedName("selftext")
    private String selftext;
    @SerializedName("approved_at_utc")
    private String approved_at_utc;

    public String getAuthor_flair_background_color() {
        return author_flair_background_color;
    }

    public void setAuthor_flair_background_color(String author_flair_background_color) {
        this.author_flair_background_color = author_flair_background_color;
    }

    public int getPwls() {
        return pwls;
    }

    public void setPwls(int pwls) {
        this.pwls = pwls;
    }



    public boolean isIs_original_content() {
        return is_original_content;
    }

    public void setIs_original_content(boolean is_original_content) {
        this.is_original_content = is_original_content;
    }

    public String getMod_note() {
        return mod_note;
    }

    public void setMod_note(String mod_note) {
        this.mod_note = mod_note;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubreddit_name_prefixed() {
        return subreddit_name_prefixed;
    }

    public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {
        this.subreddit_name_prefixed = subreddit_name_prefixed;
    }

    public boolean isSend_replies() {
        return send_replies;
    }

    public void setSend_replies(boolean send_replies) {
        this.send_replies = send_replies;
    }

    public double getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(double created_utc) {
        this.created_utc = created_utc;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String getMod_reason_by() {
        return mod_reason_by;
    }

    public void setMod_reason_by(String mod_reason_by) {
        this.mod_reason_by = mod_reason_by;
    }

    public boolean isOver_18() {
        return over_18;
    }

    public void setOver_18(boolean over_18) {
        this.over_18 = over_18;
    }

    public String getLink_flair_template_id() {
        return link_flair_template_id;
    }

    public void setLink_flair_template_id(String link_flair_template_id) {
        this.link_flair_template_id = link_flair_template_id;
    }

    public boolean isIs_reddit_media_domain() {
        return is_reddit_media_domain;
    }

    public void setIs_reddit_media_domain(boolean is_reddit_media_domain) {
        this.is_reddit_media_domain = is_reddit_media_domain;
    }

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }

    public String getSubreddit_type() {
        return subreddit_type;
    }

    public void setSubreddit_type(String subreddit_type) {
        this.subreddit_type = subreddit_type;
    }

    public String getRemoval_reason() {
        return removal_reason;
    }

    public void setRemoval_reason(String removal_reason) {
        this.removal_reason = removal_reason;
    }

    public SecureMedia getSecure_media() {
        return secure_media;
    }

    public void setSecure_media(SecureMedia secure_media) {
        this.secure_media = secure_media;
    }

    public String getNum_reports() {
        return num_reports;
    }

    public void setNum_reports(String num_reports) {
        this.num_reports = num_reports;
    }

    public boolean isStickied() {
        return stickied;
    }

    public void setStickied(boolean stickied) {
        this.stickied = stickied;
    }

    public boolean isCan_gild() {
        return can_gild;
    }

    public void setCan_gild(boolean can_gild) {
        this.can_gild = can_gild;
    }

    public boolean isContest_mode() {
        return contest_mode;
    }

    public void setContest_mode(boolean contest_mode) {
        this.contest_mode = contest_mode;
    }

    public String getAuthor_flair_type() {
        return author_flair_type;
    }

    public void setAuthor_flair_type(String author_flair_type) {
        this.author_flair_type = author_flair_type;
    }

    public String getLink_flair_text() {
        return link_flair_text;
    }

    public void setLink_flair_text(String link_flair_text) {
        this.link_flair_text = link_flair_text;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }



    public String getSubreddit_id() {
        return subreddit_id;
    }

    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
    }

    public String getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(String distinguished) {
        this.distinguished = distinguished;
    }

    public boolean isIs_meta() {
        return is_meta;
    }

    public void setIs_meta(boolean is_meta) {
        this.is_meta = is_meta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public boolean isIs_self() {
        return is_self;
    }

    public void setIs_self(boolean is_self) {
        this.is_self = is_self;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(String approved_by) {
        this.approved_by = approved_by;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public boolean isIs_crosspostable() {
        return is_crosspostable;
    }

    public void setIs_crosspostable(boolean is_crosspostable) {
        this.is_crosspostable = is_crosspostable;
    }


    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }




    public String getSuggested_sort() {
        return suggested_sort;
    }

    public void setSuggested_sort(String suggested_sort) {
        this.suggested_sort = suggested_sort;
    }

    public String getThumbnail_height() {
        return thumbnail_height;
    }

    public void setThumbnail_height(String thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
    }



    public String getLink_flair_text_color() {
        return link_flair_text_color;
    }

    public void setLink_flair_text_color(String link_flair_text_color) {
        this.link_flair_text_color = link_flair_text_color;
    }

    public String getPost_hint() {
        return post_hint;
    }

    public void setPost_hint(String post_hint) {
        this.post_hint = post_hint;
    }

    public String getAuthor_flair_css_class() {
        return author_flair_css_class;
    }

    public void setAuthor_flair_css_class(String author_flair_css_class) {
        this.author_flair_css_class = author_flair_css_class;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public boolean isMedia_only() {
        return media_only;
    }

    public void setMedia_only(boolean media_only) {
        this.media_only = media_only;
    }

    public String getLink_flair_background_color() {
        return link_flair_background_color;
    }

    public void setLink_flair_background_color(String link_flair_background_color) {
        this.link_flair_background_color = link_flair_background_color;
    }

    public String getParent_whitelist_status() {
        return parent_whitelist_status;
    }

    public void setParent_whitelist_status(String parent_whitelist_status) {
        this.parent_whitelist_status = parent_whitelist_status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getMod_reason_title() {
        return mod_reason_title;
    }

    public void setMod_reason_title(String mod_reason_title) {
        this.mod_reason_title = mod_reason_title;
    }

    public boolean isIs_video() {
        return is_video;
    }

    public void setIs_video(boolean is_video) {
        this.is_video = is_video;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail_width() {
        return thumbnail_width;
    }

    public void setThumbnail_width(String thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
    }

    public String getAuthor_flair_text_color() {
        return author_flair_text_color;
    }

    public void setAuthor_flair_text_color(String author_flair_text_color) {
        this.author_flair_text_color = author_flair_text_color;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public String getSelftext_html() {
        return selftext_html;
    }

    public void setSelftext_html(String selftext_html) {
        this.selftext_html = selftext_html;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAuthor_flair_text() {
        return author_flair_text;
    }

    public void setAuthor_flair_text(String author_flair_text) {
        this.author_flair_text = author_flair_text;
    }



    public String getCan_mod_post() {
        return can_mod_post;
    }

    public void setCan_mod_post(String can_mod_post) {
        this.can_mod_post = can_mod_post;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public String getLink_flair_css_class() {
        return link_flair_css_class;
    }

    public void setLink_flair_css_class(String link_flair_css_class) {
        this.link_flair_css_class = link_flair_css_class;
    }

    public int getNum_crossposts() {
        return num_crossposts;
    }

    public void setNum_crossposts(int num_crossposts) {
        this.num_crossposts = num_crossposts;
    }

    public boolean isHide_score() {
        return hide_score;
    }

    public void setHide_score(boolean hide_score) {
        this.hide_score = hide_score;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    public long getSubreddit_subscribers() {
        return subreddit_subscribers;
    }

    public void setSubreddit_subscribers(long subreddit_subscribers) {
        this.subreddit_subscribers = subreddit_subscribers;
    }

    public String getBanned_by() {
        return banned_by;
    }

    public void setBanned_by(String banned_by) {
        this.banned_by = banned_by;
    }


    public String getLink_flair_type() {
        return link_flair_type;
    }

    public void setLink_flair_type(String link_flair_type) {
        this.link_flair_type = link_flair_type;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getReport_reasons() {
        return report_reasons;
    }

    public void setReport_reasons(String report_reasons) {
        this.report_reasons = report_reasons;
    }

    public int getWls() {
        return wls;
    }

    public void setWls(int wls) {
        this.wls = wls;
    }

    public String getAuthor_flair_template_id() {
        return author_flair_template_id;
    }

    public void setAuthor_flair_template_id(String author_flair_template_id) {
        this.author_flair_template_id = author_flair_template_id;
    }

    public String getBanned_at_utc() {
        return banned_at_utc;
    }

    public void setBanned_at_utc(String banned_at_utc) {
        this.banned_at_utc = banned_at_utc;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public String getWhitelist_status() {
        return whitelist_status;
    }

    public void setWhitelist_status(String whitelist_status) {
        this.whitelist_status = whitelist_status;
    }

    public boolean isNo_follow() {
        return no_follow;
    }

    public void setNo_follow(boolean no_follow) {
        this.no_follow = no_follow;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getApproved_at_utc() {
        return approved_at_utc;
    }

    public void setApproved_at_utc(String approved_at_utc) {
        this.approved_at_utc = approved_at_utc;
    }
}
