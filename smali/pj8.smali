.class public final Lpj8;
.super Lf76;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b:Ljava/util/logging/Level;

.field public final c:Ljava/util/Set;

.field public final d:Lzd9;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 2
    .line 3
    sget-object v1, Lqj8;->f:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lf76;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lpj8;->b:Ljava/util/logging/Level;

    .line 9
    .line 10
    sget-object p1, Lqj8;->f:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p1, p0, Lpj8;->c:Ljava/util/Set;

    .line 13
    .line 14
    sget-object p1, Lqj8;->g:Lzd9;

    .line 15
    .line 16
    iput-object p1, p0, Lpj8;->d:Lzd9;

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


# virtual methods
.method public final a(Ljava/util/logging/Level;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final b(Luc9;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Luc9;->d()Lb85;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lqd9;->b:Lid9;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lb85;->A(Lid9;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lf76;->a:Ljava/lang/String;

    .line 16
    .line 17
    :cond_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, Luc9;->d:Lfd9;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lfd9;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/16 v1, 0x2e

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x24

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ltz v1, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "cannot request log site information prior to postProcess()"

    .line 48
    .line 49
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    :goto_0
    iget-object v1, p0, Lpj8;->d:Lzd9;

    .line 54
    .line 55
    invoke-static {v0}, Lfb5;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, p0, Lpj8;->b:Ljava/util/logging/Level;

    .line 60
    .line 61
    iget-object p0, p0, Lpj8;->c:Ljava/util/Set;

    .line 62
    .line 63
    invoke-static {p1, v0, v2, p0, v1}, Lqj8;->d(Luc9;Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;Lzd9;)V

    .line 64
    .line 65
    .line 66
    return-void
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
