.class public final Lv34;
.super Lwj1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic D:[Lyr3;


# instance fields
.field public final A:Lib4;

.field public final B:Lib4;

.field public final C:Ly34;

.field public final y:Ltl4;

.field public final z:Lup2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lv34;

    .line 4
    .line 5
    const-string v2, "fragments"

    .line 6
    .line 7
    const-string v3, "getFragments()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lgr5;

    .line 14
    .line 15
    const-string v3, "empty"

    .line 16
    .line 17
    const-string v5, "getEmpty()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [Lyr3;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, Lv34;->D:[Lyr3;

    .line 31
    .line 32
    return-void
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
.end method

.method public constructor <init>(Ltl4;Lup2;Lkb4;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lme6;->x:Lqm;

    .line 8
    .line 9
    iget-object v1, p2, Lup2;->a:Lvp2;

    .line 10
    .line 11
    invoke-virtual {v1}, Lvp2;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v1, Lvp2;->e:Luq4;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1}, Lvp2;->g()Luq4;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-direct {p0, v0, v1}, Lwj1;-><init>(Lrm;Luq4;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lv34;->y:Ltl4;

    .line 28
    .line 29
    iput-object p2, p0, Lv34;->z:Lup2;

    .line 30
    .line 31
    new-instance p1, Lu34;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-direct {p1, p0, p2}, Lu34;-><init>(Lv34;I)V

    .line 35
    .line 36
    .line 37
    new-instance p2, Lib4;

    .line 38
    .line 39
    invoke-direct {p2, p3, p1}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lv34;->A:Lib4;

    .line 43
    .line 44
    new-instance p1, Lu34;

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-direct {p1, p0, p2}, Lu34;-><init>(Lv34;I)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Lib4;

    .line 51
    .line 52
    invoke-direct {p2, p3, p1}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lv34;->B:Lib4;

    .line 56
    .line 57
    new-instance p1, Ly34;

    .line 58
    .line 59
    new-instance p2, Lu34;

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    invoke-direct {p2, p0, v0}, Lu34;-><init>(Lv34;I)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, p3, p2}, Ly34;-><init>(Lkb4;Lsr2;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lv34;->C:Ly34;

    .line 69
    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final P(Lzj1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lzj1;->t(Lv34;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lv34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lv34;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v1, p0, Lv34;->z:Lup2;

    .line 14
    .line 15
    iget-object v2, p1, Lv34;->z:Lup2;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lv34;->y:Ltl4;

    .line 24
    .line 25
    iget-object p1, p1, Lv34;->y:Ltl4;

    .line 26
    .line 27
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    return v0
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv34;->y:Ltl4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lv34;->z:Lup2;

    .line 10
    .line 11
    invoke-virtual {p0}, Lup2;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final r()Lvj1;
    .locals 2

    .line 1
    iget-object v0, p0, Lv34;->z:Lup2;

    .line 2
    .line 3
    iget-object v1, v0, Lup2;->a:Lvp2;

    .line 4
    .line 5
    invoke-virtual {v1}, Lvp2;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p0, Lv34;->y:Ltl4;

    .line 14
    .line 15
    invoke-virtual {v0}, Lup2;->b()Lup2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ltl4;->k0(Lup2;)Lv34;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method
