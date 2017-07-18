--// csms_init
-- Migration SQL that makes the change goes here.

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (3, '办案区管控', 'MODULE', 'BUSINESS', '/overviews.htm', NULL, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (4, '案件监督', 'MODULE', 'BUSINESS', '/caseWarnings.htm', NULL, 4);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (5, '录音录像', 'MODULE', 'BUSINESS', '/caseMedias.htm', NULL, 5);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (6, '案件管理', 'MODULE', 'BUSINESS', '/caseOpening.htm', NULL, 6);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (7, '基础数据', 'MODULE', 'BUSINESS', '/bdmPoliceStations.htm', NULL, 7);

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (31, '案件监控', 'GROUP', 'BUSINESS', NULL, 3, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (311, '办案区监控', 'LEAF', 'BUSINESS', '/overviews.htm', 31, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (32, '案件办理', 'GROUP', 'BUSINESS', NULL, 3, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (321, '现场调解', 'LEAF', 'BUSINESS', '/cases/dispute.htm', 32, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (322, '行政案件', 'LEAF', 'BUSINESS', '/cases/civil.htm', 32, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (323, '刑事案件', 'LEAF', 'BUSINESS', '/cases/criminal.htm', 32, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (324, '办案记录', 'LEAF', 'BUSINESS', '/caseRecords.htm', 32, 4);

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (41, '积分管理', 'GROUP', 'BUSINESS', NULL, 4, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (411, '评价打分', 'LEAF', 'BUSINESS', '/caseScores/mark.htm', 41, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (412, '我的积分', 'LEAF', 'BUSINESS', '/caseScores/detail.htm', 41, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (413, '评价标准', 'LEAF', 'BUSINESS', '/bdmEvaluations.htm', 41, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (42, '积分排名', 'GROUP', 'BUSINESS', NULL, 4, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (421, '单位积分排名', 'LEAF', 'BUSINESS', '/caseScores/rank/bdmPoliceStationRank.htm', 42, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (422, '民警积分排名', 'LEAF', 'BUSINESS', '/caseScores/rank/bdmPoliceRank.htm', 42, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (423, '案件积分排名', 'LEAF', 'BUSINESS', '/caseScores/rank/caseRank.htm', 42, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (43, '风险等级', 'LEAF', 'BUSINESS', '/bdmClassifications.htm', 4, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (44, '受立案监督', 'LEAF', 'BUSINESS', '/caseWarnings.htm', 4, 4);

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (51, '视频列表', 'LEAF', 'BUSINESS', '/caseMedias.htm', 5, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (52, '视频类别', 'LEAF', 'BUSINESS', '/bdmVideoCategories.htm', 5, 2);
-- INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (53, '统计分析', 'GROUP', 'BUSINESS', NULL, 5, 3);
-- INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (531, '案件数量统计', 'LEAF', 'BUSINESS', '/statis/ajsl.htm', 53, 1);
-- INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (532, '视频上传统计', 'LEAF', 'BUSINESS', '/statis/spsc.htm', 53, 2);
-- INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (533, '案件规范走势', 'LEAF', 'BUSINESS', '/statis/gfzs.htm', 53, 3);
-- INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (534, '执法情况报告', 'LEAF', 'BUSINESS', '/statis/zfbg.htm', 53, 4);

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (61, '案件公开', 'LEAF', 'BUSINESS', '/caseOpening.htm', 6, 1);

INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (71, '公安机关', 'LEAF', 'BUSINESS', '/bdmPoliceStations.htm', 7, 1);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (72, '办案区维护', 'LEAF', 'BUSINESS', '/bdmHandlingAreas.htm', 7, 2);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (73, '房间维护', 'LEAF', 'BUSINESS', '/bdmRooms.htm', 7, 3);
INSERT INTO smart_menus (id_, name_, type_, plugin_, url_, parent_id_, display_order_) VALUES (74, '房间布局', 'LEAF', 'BUSINESS', '/bdmRoomLayout.htm', 7, 4);

--//@UNDO
-- SQL to undo the change goes here.


