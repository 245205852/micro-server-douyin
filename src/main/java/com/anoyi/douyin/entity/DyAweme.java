package com.anoyi.douyin.entity;

import lombok.Data;

import java.util.List;

@Data
public class DyAweme {

    private List<Aweme> aweme_list;

    private int has_more;

    private long max_cursor;

    private long min_cursor;

    private long status_code;

    @Data
    public class Aweme{
        private String aweme_id;
        private String desc;
        private int aweme_type;
        private int media_type;
        private Statistics statistics;
        private List<TextExtra> text_extra;
        private Video video;
        @Data
        public class Statistics{
            private String digg_count;
            private int forward_count;
        }
        @Data
        public class TextExtra{
            private int end;
            private String hashtag_name;
            private int start;
            private int type;
        }
        @Data
        public class Video{
            private UrlJSON cover;
            private UrlJSON dynamic_cover;
            private int height;
            private UrlJSON play_addr;
            private int width;
            @Data
            public class UrlJSON{
                private String uri;
                private String[] url_list;
            }
        }
    }

}
