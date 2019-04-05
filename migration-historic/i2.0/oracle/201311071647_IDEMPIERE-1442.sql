SET SQLBLANKLINES ON
SET DEFINE OFF

-- Nov 7, 2013 4:46:57 PM COT
-- IDEMPIERE-1442 Additional confirmation on close and void action
UPDATE AD_Field SET SeqNo=50,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=1311
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=70,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=3052
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=80,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=3054
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=90, IsDisplayed='Y', XPosition=4,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=201340
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=100, IsDisplayed='Y', XPosition=1,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=200948
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=110, IsDisplayed='Y', XPosition=4,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=200949
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=120, IsDisplayed='Y', XPosition=2,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=202532
;

-- Nov 7, 2013 4:46:57 PM COT
UPDATE AD_Field SET SeqNo=130, IsDisplayed='Y', XPosition=5,Updated=TO_DATE('2013-11-07 16:46:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=202533
;

SELECT register_migration_script('201311071647_IDEMPIERE-1442.sql') FROM dual
;

