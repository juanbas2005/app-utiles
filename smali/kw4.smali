.class public final synthetic Lkw4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:Lgs2;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ltg7;

.field public final synthetic z:Lfw4;


# direct methods
.method public synthetic constructor <init>(ZLtg7;Lfw4;Lgs2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkw4;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Lkw4;->x:Z

    .line 8
    .line 9
    iput-object p2, p0, Lkw4;->y:Ltg7;

    .line 10
    .line 11
    iput-object p3, p0, Lkw4;->z:Lfw4;

    .line 12
    .line 13
    iput-object p4, p0, Lkw4;->A:Lgs2;

    .line 14
    .line 15
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public synthetic constructor <init>(ZLtg7;Lfw4;Lgs2;I)V
    .locals 0

    .line 16
    const/4 p5, 0x0

    iput p5, p0, Lkw4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkw4;->x:Z

    iput-object p2, p0, Lkw4;->y:Ltg7;

    iput-object p3, p0, Lkw4;->z:Lfw4;

    iput-object p4, p0, Lkw4;->A:Lgs2;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lkw4;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v7, p1

    .line 10
    check-cast v7, Lyt2;

    .line 11
    .line 12
    move-object/from16 p1, p2

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    and-int/lit8 v0, p1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq v0, v3, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    and-int/2addr p1, v2

    .line 29
    invoke-virtual {v7, p1, v0}, Lyt2;->V(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    iget-boolean v3, p0, Lkw4;->x:Z

    .line 37
    .line 38
    iget-object v4, p0, Lkw4;->y:Ltg7;

    .line 39
    .line 40
    iget-object v5, p0, Lkw4;->z:Lfw4;

    .line 41
    .line 42
    iget-object v6, p0, Lkw4;->A:Lgs2;

    .line 43
    .line 44
    invoke-static/range {v3 .. v8}, Lhj8;->l(ZLtg7;Lfw4;Lgs2;Lyt2;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v7}, Lyt2;->Y()V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-object v1

    .line 52
    :pswitch_0
    move-object v12, p1

    .line 53
    check-cast v12, Lyt2;

    .line 54
    .line 55
    move-object/from16 p1, p2

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Lb85;->v(I)I

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    iget-boolean v8, p0, Lkw4;->x:Z

    .line 67
    .line 68
    iget-object v9, p0, Lkw4;->y:Ltg7;

    .line 69
    .line 70
    iget-object v10, p0, Lkw4;->z:Lfw4;

    .line 71
    .line 72
    iget-object v11, p0, Lkw4;->A:Lgs2;

    .line 73
    .line 74
    invoke-static/range {v8 .. v13}, Lhj8;->l(ZLtg7;Lfw4;Lgs2;Lyt2;I)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
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
