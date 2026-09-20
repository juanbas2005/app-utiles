.class public final Lpn7;
.super Lor0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public i0:Lij7;


# virtual methods
.method public final Y0(Lok6;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpn7;->i0:Lij7;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lmk6;->h(Lok6;Lij7;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lpe2;->B:Lcf;

    .line 7
    .line 8
    sget-object v1, Ljk6;->s:Lnk6;

    .line 9
    .line 10
    sget-object v2, Lmk6;->a:[Lyr3;

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    aget-object v3, v2, v3

    .line 15
    .line 16
    invoke-interface {p1, v1, v0}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lpn7;->i0:Lij7;

    .line 20
    .line 21
    sget-object v0, Lij7;->y:Lij7;

    .line 22
    .line 23
    if-eq p0, v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v1, 0x1a

    .line 31
    .line 32
    if-lt v0, v1, :cond_1

    .line 33
    .line 34
    new-instance v0, Lag;

    .line 35
    .line 36
    invoke-static {p0}, Lr4;->h(Z)Landroid/view/autofill/AutofillValue;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0}, Lag;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_1
    if-eqz v0, :cond_2

    .line 46
    .line 47
    sget-object p0, Ljk6;->t:Lnk6;

    .line 48
    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    aget-object v1, v2, v1

    .line 52
    .line 53
    invoke-interface {p1, p0, v0}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    new-instance p0, Ldp0;

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-direct {p0, p1, v0}, Ldp0;-><init>(Lok6;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p0}, Lmk6;->b(Lok6;Lvr2;)V

    .line 63
    .line 64
    .line 65
    return-void
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
