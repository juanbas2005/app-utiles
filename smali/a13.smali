.class public final synthetic La13;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc23;

.field public final synthetic y:Laq4;


# direct methods
.method public synthetic constructor <init>(Lc23;Laq4;I)V
    .locals 0

    .line 1
    iput p3, p0, La13;->w:I

    .line 2
    .line 3
    iput-object p1, p0, La13;->x:Lc23;

    .line 4
    .line 5
    iput-object p2, p0, La13;->y:Laq4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, La13;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, p0, La13;->y:Laq4;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, Landroid/net/Uri;

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    new-instance v7, Lxi;

    .line 17
    .line 18
    const/16 p1, 0x14

    .line 19
    .line 20
    invoke-direct {v7, v3, p1}, Lxi;-><init>(Laq4;I)V

    .line 21
    .line 22
    .line 23
    iget-object v5, p0, La13;->x:Lc23;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v5}, Lu58;->a(Lr58;)Lls0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v4, Lgv;

    .line 33
    .line 34
    const/4 v9, 0x2

    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-direct/range {v4 .. v9}, Lgv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v8, v8, v4, v2}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 40
    .line 41
    .line 42
    :cond_0
    return-object v1

    .line 43
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-interface {v3}, La37;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    iget-object p0, p0, La13;->x:Lc23;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, Lw6;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct {v4, p0, p1, v0, v5}, Lw6;-><init>(Lc23;Landroid/net/Uri;Ljava/lang/String;Lf61;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v5, v5, v4, v2}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 72
    .line 73
    .line 74
    :cond_1
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 76
.end method
