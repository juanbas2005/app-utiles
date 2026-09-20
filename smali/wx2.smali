.class public final Lwx2;
.super Landroid/telephony/PhoneStateListener;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Service;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Service;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwx2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwx2;->b:Landroid/app/Service;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lwx2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lwx2;->b:Landroid/app/Service;

    .line 13
    .line 14
    check-cast p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 15
    .line 16
    invoke-static {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->c(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public onServiceStateChanged(Landroid/telephony/ServiceState;)V
    .locals 1

    .line 1
    iget v0, p0, Lwx2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/telephony/PhoneStateListener;->onServiceStateChanged(Landroid/telephony/ServiceState;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lwx2;->b:Landroid/app/Service;

    .line 11
    .line 12
    check-cast p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/telephony/ServiceState;->getState()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    :cond_0
    invoke-static {p0, v0}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->b(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
