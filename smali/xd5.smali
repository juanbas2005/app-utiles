.class public final Lxd5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lh11;


# instance fields
.field public final w:Lva6;

.field public final x:Ljava/lang/String;

.field public final y:Lgs2;

.field public final z:Lz97;


# direct methods
.method public constructor <init>(Lva6;Ljava/lang/String;Lgs2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxd5;->w:Lva6;

    .line 5
    .line 6
    iput-object p2, p0, Lxd5;->x:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lxd5;->y:Lgs2;

    .line 9
    .line 10
    new-instance p1, Lhx4;

    .line 11
    .line 12
    const/4 p2, 0x5

    .line 13
    invoke-direct {p1, p2, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lz97;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lz97;-><init>(Lsr2;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lxd5;->z:Lz97;

    .line 22
    .line 23
    return-void
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
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lxd5;->z:Lz97;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz97;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lua6;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final w(ZLgs2;Lh61;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p3}, Lf61;->r()Le81;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lwd5;->x:Ljv2;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Le81;->a0(Ld81;)Lc81;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lwd5;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lwd5;->w:Lvd5;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v0

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-interface {p2, p1, p3}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance p1, Lvd5;

    .line 28
    .line 29
    iget-object v1, p0, Lxd5;->z:Lz97;

    .line 30
    .line 31
    invoke-virtual {v1}, Lz97;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lua6;

    .line 36
    .line 37
    iget-object p0, p0, Lxd5;->y:Lgs2;

    .line 38
    .line 39
    invoke-direct {p1, p0, v1}, Lvd5;-><init>(Lgs2;Lua6;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Lwd5;

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lwd5;-><init>(Lvd5;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lk05;

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    invoke-direct {v1, p2, p1, v0, v2}, Lk05;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1, p3}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
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
