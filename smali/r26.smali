.class public final synthetic Lr26;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lxa7;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lxa7;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr26;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lr26;->x:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lr26;->y:Lxa7;

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
    .locals 9

    .line 1
    iget v0, p0, Lr26;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const v2, 0x2fd4df92

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    iget-object v4, p0, Lr26;->y:Lxa7;

    .line 10
    .line 11
    iget-object p0, p0, Lr26;->x:Ljava/util/List;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    check-cast p1, Lh34;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v6, Ly20;

    .line 27
    .line 28
    const/16 v7, 0x8

    .line 29
    .line 30
    invoke-direct {v6, v7, p0}, Ly20;-><init>(ILjava/util/List;)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lc36;

    .line 34
    .line 35
    invoke-direct {v7, p0, v4, v5}, Lc36;-><init>(Ljava/util/List;Lxa7;I)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Lfw0;

    .line 39
    .line 40
    invoke-direct {p0, v2, v7, v5}, Lfw0;-><init>(ILjava/lang/Object;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v3, v6, p0}, Lh34;->P(ILvr2;Lvr2;Lfw0;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    new-instance v6, Ly20;

    .line 55
    .line 56
    const/4 v7, 0x7

    .line 57
    invoke-direct {v6, v7, p0}, Ly20;-><init>(ILjava/util/List;)V

    .line 58
    .line 59
    .line 60
    new-instance v7, Lc36;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-direct {v7, p0, v4, v8}, Lc36;-><init>(Ljava/util/List;Lxa7;I)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Lfw0;

    .line 67
    .line 68
    invoke-direct {p0, v2, v7, v5}, Lfw0;-><init>(ILjava/lang/Object;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0, v3, v6, p0}, Lh34;->P(ILvr2;Lvr2;Lfw0;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 76
.end method
