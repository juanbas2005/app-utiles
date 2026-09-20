.class public final Lrs6;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgd5;


# instance fields
.field public K:Lkb;


# virtual methods
.method public final v(Ltp1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p1, p2, Lba6;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lba6;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    new-instance p2, Lba6;

    .line 12
    .line 13
    invoke-direct {p2}, Lba6;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    new-instance p1, Lob;

    .line 17
    .line 18
    iget-object p0, p0, Lrs6;->K:Lkb;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lob;-><init>(Lkb;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lcc1;

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcc1;-><init>(Lob;)V

    .line 26
    .line 27
    .line 28
    iput-object p0, p2, Lba6;->c:Lie1;

    .line 29
    .line 30
    return-object p2
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
