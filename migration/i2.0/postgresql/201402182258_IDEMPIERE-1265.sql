-- Feb 18, 2014 10:57:39 PM COT
-- IDEMPIERE-1265 Add Adaxa Sales Management
UPDATE AD_Menu SET IsCentrallyMaintained='N',Updated=TO_TIMESTAMP('2014-02-18 22:57:39','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Menu_ID=53363
;

SELECT register_migration_script('201402182258_IDEMPIERE-1265.sql') FROM dual
;

