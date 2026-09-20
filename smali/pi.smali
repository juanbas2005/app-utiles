.class public final synthetic Lpi;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lui;

.field public final synthetic y:Lzc7;


# direct methods
.method public synthetic constructor <init>(Lui;Lzc7;I)V
    .locals 0

    .line 1
    iput p3, p0, Lpi;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lpi;->x:Lui;

    .line 4
    .line 5
    iput-object p2, p0, Lpi;->y:Lzc7;

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
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lpi;->w:I

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lpi;->y:Lzc7;

    .line 8
    .line 9
    iget-object p0, p0, Lpi;->x:Lui;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lui;->c:Lsr2;

    .line 15
    .line 16
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Ldy3;

    .line 22
    .line 23
    invoke-interface {v0}, Ldy3;->n()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    :cond_0
    check-cast v3, Ldy3;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    sget-object p0, Lly5;->e:Lly5;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v4, v3}, Lzc7;->k(Ldy3;)Lly5;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    invoke-interface {v3, v0, v1}, Ldy3;->R(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-virtual {p0, v0, v1}, Lly5;->i(J)Lly5;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    return-object p0

    .line 52
    :pswitch_0
    iget-object v0, p0, Lui;->g:Loi;

    .line 53
    .line 54
    new-instance v5, Lpi;

    .line 55
    .line 56
    invoke-direct {v5, p0, v4, v2}, Lpi;-><init>(Lui;Lzc7;I)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lh06;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lui;->e:Lcy6;

    .line 65
    .line 66
    new-instance v6, Lf5;

    .line 67
    .line 68
    invoke-direct {v6, v2, v4, v5}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v2, "positioner"

    .line 72
    .line 73
    invoke-virtual {p0, v2, v0, v6}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 74
    .line 75
    .line 76
    iget-object p0, v4, Lh06;->w:Ljava/lang/Object;

    .line 77
    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    check-cast p0, Lly5;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    invoke-static {v1}, Lsg3;->a0(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v3

    .line 87
    :pswitch_1
    iget-object v0, p0, Lui;->f:Loi;

    .line 88
    .line 89
    new-instance v5, Lzh;

    .line 90
    .line 91
    const/4 v6, 0x1

    .line 92
    invoke-direct {v5, v6, v4}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lh06;

    .line 96
    .line 97
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Lui;->e:Lcy6;

    .line 101
    .line 102
    new-instance v6, Lf5;

    .line 103
    .line 104
    invoke-direct {v6, v2, v4, v5}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const-string v2, "dataBuilder"

    .line 108
    .line 109
    invoke-virtual {p0, v2, v0, v6}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v4, Lh06;->w:Ljava/lang/Object;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    check-cast p0, Lyc7;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_3
    invoke-static {v1}, Lsg3;->a0(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v3

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
