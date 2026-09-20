.class public Lps;
.super Le21;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b:Lvr2;


# direct methods
.method public constructor <init>(Ljava/util/List;Lvr2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le21;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lps;->b:Lvr2;

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
.method public final a(Lsl4;)Lvw3;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lps;->b:Lvr2;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lvw3;

    .line 11
    .line 12
    invoke-static {p0}, Lfv3;->z(Lvw3;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lvw3;->L()Lwo7;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lwo7;->u()Lvq0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lfv3;->s(Lvq0;)Lro5;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    sget-object p1, Lm27;->W:Lup2;

    .line 36
    .line 37
    iget-object p1, p1, Lup2;->a:Lvp2;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lfv3;->C(Lvw3;Lvp2;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    sget-object p1, Lm27;->X:Lup2;

    .line 46
    .line 47
    iget-object p1, p1, Lup2;->a:Lvp2;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lfv3;->C(Lvw3;Lvp2;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    sget-object p1, Lm27;->Y:Lup2;

    .line 56
    .line 57
    iget-object p1, p1, Lup2;->a:Lvp2;

    .line 58
    .line 59
    invoke-static {p0, p1}, Lfv3;->C(Lvw3;Lvp2;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    sget-object p1, Lm27;->Z:Lup2;

    .line 66
    .line 67
    iget-object p1, p1, Lup2;->a:Lvp2;

    .line 68
    .line 69
    invoke-static {p0, p1}, Lfv3;->C(Lvw3;Lvp2;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
.end method
