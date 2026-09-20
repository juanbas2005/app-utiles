.class public interface abstract Lcu8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract beginAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract clearMeasurementEnabled(J)V
.end method

.method public abstract endAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract generateEventId(Lju8;)V
.end method

.method public abstract getAppInstanceId(Lju8;)V
.end method

.method public abstract getCachedAppInstanceId(Lju8;)V
.end method

.method public abstract getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lju8;)V
.end method

.method public abstract getCurrentScreenClass(Lju8;)V
.end method

.method public abstract getCurrentScreenName(Lju8;)V
.end method

.method public abstract getGmpAppId(Lju8;)V
.end method

.method public abstract getMaxUserProperties(Ljava/lang/String;Lju8;)V
.end method

.method public abstract getSessionId(Lju8;)V
.end method

.method public abstract getTestFlag(Lju8;I)V
.end method

.method public abstract getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLju8;)V
.end method

.method public abstract initForTests(Ljava/util/Map;)V
.end method

.method public abstract initialize(Ly73;Liv8;J)V
.end method

.method public abstract initializeWithElapsedTime(Ly73;Liv8;JJ)V
.end method

.method public abstract isDataCollectionEnabled(Lju8;)V
.end method

.method public abstract logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
.end method

.method public abstract logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lju8;J)V
.end method

.method public abstract logEventWithElapsedTime(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJJ)V
.end method

.method public abstract logHealthData(ILjava/lang/String;Ly73;Ly73;Ly73;)V
.end method

.method public abstract onActivityCreated(Ly73;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityCreatedByScionActivityInfo(Ljv8;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityDestroyed(Ly73;J)V
.end method

.method public abstract onActivityDestroyedByScionActivityInfo(Ljv8;J)V
.end method

.method public abstract onActivityPaused(Ly73;J)V
.end method

.method public abstract onActivityPausedByScionActivityInfo(Ljv8;J)V
.end method

.method public abstract onActivityResumed(Ly73;J)V
.end method

.method public abstract onActivityResumedByScionActivityInfo(Ljv8;J)V
.end method

.method public abstract onActivitySaveInstanceState(Ly73;Lju8;J)V
.end method

.method public abstract onActivitySaveInstanceStateByScionActivityInfo(Ljv8;Lju8;J)V
.end method

.method public abstract onActivityStarted(Ly73;J)V
.end method

.method public abstract onActivityStartedByScionActivityInfo(Ljv8;J)V
.end method

.method public abstract onActivityStopped(Ly73;J)V
.end method

.method public abstract onActivityStoppedByScionActivityInfo(Ljv8;J)V
.end method

.method public abstract performAction(Landroid/os/Bundle;Lju8;J)V
.end method

.method public abstract registerOnMeasurementEventListener(Ltu8;)V
.end method

.method public abstract resetAnalyticsData(J)V
.end method

.method public abstract resetAnalyticsDataWithElapsedTime(JJ)V
.end method

.method public abstract retrieveAndUploadBatches(Lpu8;)V
.end method

.method public abstract setConditionalUserProperty(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsent(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsentThirdParty(Landroid/os/Bundle;J)V
.end method

.method public abstract setCurrentScreen(Ly73;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setCurrentScreenByScionActivityInfo(Ljv8;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setDataCollectionEnabled(Z)V
.end method

.method public abstract setDefaultEventParameters(Landroid/os/Bundle;)V
.end method

.method public abstract setEventInterceptor(Ltu8;)V
.end method

.method public abstract setInstanceIdProvider(Lhv8;)V
.end method

.method public abstract setMeasurementEnabled(ZJ)V
.end method

.method public abstract setMinimumSessionDuration(J)V
.end method

.method public abstract setSessionTimeoutDuration(J)V
.end method

.method public abstract setSgtmDebugInfo(Landroid/content/Intent;)V
.end method

.method public abstract setUserId(Ljava/lang/String;J)V
.end method

.method public abstract setUserProperty(Ljava/lang/String;Ljava/lang/String;Ly73;ZJ)V
.end method

.method public abstract unregisterOnMeasurementEventListener(Ltu8;)V
.end method
