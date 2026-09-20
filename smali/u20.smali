.class public final synthetic Lu20;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lsr2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lsr2;II)V
    .locals 0

    .line 12
    iput p4, p0, Lu20;->w:I

    iput-object p1, p0, Lu20;->x:Ljava/lang/String;

    iput-object p2, p0, Lu20;->y:Lsr2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsr2;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lu20;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lu20;->y:Lsr2;

    .line 8
    .line 9
    iput-object p2, p0, Lu20;->x:Ljava/lang/String;

    .line 10
    .line 11
    return-void
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lu20;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lu20;->y:Lsr2;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Lvs7;->a:Lvs7;

    .line 7
    .line 8
    iget-object v4, p0, Lu20;->x:Ljava/lang/String;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v11, p1

    .line 14
    check-cast v11, Lyt2;

    .line 15
    .line 16
    move-object/from16 v0, p2

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    and-int/lit8 v1, v0, 0x3

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-eq v1, v5, :cond_0

    .line 28
    .line 29
    move v1, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v0, v2

    .line 33
    invoke-virtual {v11, v0, v1}, Lyt2;->V(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lq20;

    .line 40
    .line 41
    const/16 v1, 0x12

    .line 42
    .line 43
    invoke-direct {v0, v4, v1}, Lq20;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    const v1, -0x78f0dea4

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0, v11}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    const/high16 v12, 0x180000

    .line 54
    .line 55
    const/16 v13, 0x3e

    .line 56
    .line 57
    iget-object v5, p0, Lu20;->y:Lsr2;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    invoke-static/range {v5 .. v13}, Lhj8;->e(Lsr2;Lml4;ZLa83;Lpq6;Lgs2;Lyt2;II)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v11}, Lyt2;->Y()V

    .line 68
    .line 69
    .line 70
    :goto_1
    return-object v3

    .line 71
    :pswitch_0
    move-object p0, p1

    .line 72
    check-cast p0, Lyt2;

    .line 73
    .line 74
    move-object/from16 v0, p2

    .line 75
    .line 76
    check-cast v0, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v2}, Lb85;->v(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v4, v1, p0, v0}, Ld36;->g(Ljava/lang/String;Lsr2;Lyt2;I)V

    .line 86
    .line 87
    .line 88
    return-object v3

    .line 89
    :pswitch_1
    move-object p0, p1

    .line 90
    check-cast p0, Lyt2;

    .line 91
    .line 92
    move-object/from16 v0, p2

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const/16 v0, 0x31

    .line 100
    .line 101
    invoke-static {v0}, Lb85;->v(I)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v4, v1, p0, v0}, Lb30;->i(Ljava/lang/String;Lsr2;Lyt2;I)V

    .line 106
    .line 107
    .line 108
    return-object v3

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
