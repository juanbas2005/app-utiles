.class public final synthetic Lul1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lxv0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lav5;


# direct methods
.method public synthetic constructor <init>(Lav5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lul1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lul1;->x:Lav5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final d(Lkd6;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lul1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lul1;->x:Lav5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(Lav5;Lkd6;)Lb46;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->b(Lav5;Lkd6;)Lef2;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Lav5;Lkd6;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_2
    new-instance v0, Lwl1;

    .line 24
    .line 25
    const-class v1, Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lkd6;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/content/Context;

    .line 32
    .line 33
    const-class v2, Loe2;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Lkd6;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Loe2;

    .line 40
    .line 41
    invoke-virtual {v2}, Loe2;->d()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-class v3, Lhz2;

    .line 46
    .line 47
    invoke-static {v3}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p1, v3}, Lkd6;->d(Lav5;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-class v4, Lho1;

    .line 56
    .line 57
    invoke-virtual {p1, v4}, Lkd6;->h(Ljava/lang/Class;)Lnu5;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p1, p0}, Lkd6;->s(Lav5;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    move-object v5, p0

    .line 66
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    invoke-direct/range {v0 .. v5}, Lwl1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lnu5;Ljava/util/concurrent/Executor;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 74
    .line 75
    .line 76
.end method
