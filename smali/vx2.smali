.class public final Lvx2;
.super Landroid/telephony/TelephonyCallback;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/telephony/TelephonyCallback$ServiceStateListener;


# instance fields
.field public final synthetic a:Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;


# direct methods
.method public constructor <init>(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvx2;->a:Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/telephony/TelephonyCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final onServiceStateChanged(Landroid/telephony/ServiceState;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/telephony/ServiceState;->getState()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iget-object p0, p0, Lvx2;->a:Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;

    .line 14
    .line 15
    invoke-static {p0, p1}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->b(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;Z)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method
