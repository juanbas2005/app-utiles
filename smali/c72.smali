.class public final Lc72;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lnu5;


# direct methods
.method public constructor <init>(Lnu5;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc72;->a:Lnu5;

    .line 8
    .line 9
    return-void
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
.method public final a(Lrm6;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc72;->a:Lnu5;

    .line 2
    .line 3
    invoke-interface {v0}, Lnu5;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcn7;

    .line 8
    .line 9
    new-instance v1, Lm42;

    .line 10
    .line 11
    const-string v2, "json"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lm42;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lta1;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Lta1;-><init>(Lc72;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, Ldn7;

    .line 22
    .line 23
    const-string p0, "FIREBASE_APPQUALITY_SESSION"

    .line 24
    .line 25
    invoke-virtual {v0, p0, v1, v2}, Ldn7;->a(Ljava/lang/String;Lm42;Lul7;)Lo9;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Ln00;

    .line 30
    .line 31
    sget-object v1, Lto5;->w:Lto5;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p1, v1, v2}, Ln00;-><init>(Ljava/lang/Object;Lto5;Lh10;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lkj6;

    .line 38
    .line 39
    const/16 v1, 0x10

    .line 40
    .line 41
    invoke-direct {p1, v1}, Lkj6;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p1}, Lo9;->K(Ln00;Ljn7;)V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
