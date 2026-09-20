.class public final Lhq8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lhq8;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lhq8;->y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lhq8;->x:I

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
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
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lhq8;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhq8;->y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lrl8;

    .line 9
    .line 10
    iget p0, p0, Lhq8;->x:I

    .line 11
    .line 12
    invoke-virtual {v0}, Lrl8;->y()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    return p0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lhq8;->y:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lmq8;

    .line 25
    .line 26
    iget-object v0, v0, Lmq8;->w:Ljava/lang/String;

    .line 27
    .line 28
    iget p0, p0, Lhq8;->x:I

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-ge p0, v0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    :goto_1
    return p0

    .line 40
    :pswitch_1
    iget-object v0, p0, Lhq8;->y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lmq8;

    .line 43
    .line 44
    iget-object v0, v0, Lmq8;->w:Ljava/lang/String;

    .line 45
    .line 46
    iget p0, p0, Lhq8;->x:I

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-ge p0, v0, :cond_2

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    :goto_2
    return p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lhq8;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lhq8;->y:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lrl8;

    .line 10
    .line 11
    iget v0, p0, Lhq8;->x:I

    .line 12
    .line 13
    invoke-virtual {v2}, Lrl8;->y()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget v4, p0, Lhq8;->x:I

    .line 18
    .line 19
    if-ge v0, v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v0, v4, 0x1

    .line 22
    .line 23
    iput v0, p0, Lhq8;->x:I

    .line 24
    .line 25
    invoke-virtual {v2, v4}, Lrl8;->z(I)Lbq8;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    add-int/lit8 p0, p0, 0x15

    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 43
    .line 44
    .line 45
    const-string p0, "Out of bounds index: "

    .line 46
    .line 47
    invoke-static {v0, p0, v4}, Lhl6;->p(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lkj6;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-object v1

    .line 55
    :pswitch_0
    check-cast v2, Lmq8;

    .line 56
    .line 57
    iget-object v0, v2, Lmq8;->w:Ljava/lang/String;

    .line 58
    .line 59
    iget v3, p0, Lhq8;->x:I

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-ge v3, v0, :cond_1

    .line 66
    .line 67
    add-int/lit8 v0, v3, 0x1

    .line 68
    .line 69
    new-instance v1, Lmq8;

    .line 70
    .line 71
    iput v0, p0, Lhq8;->x:I

    .line 72
    .line 73
    iget-object p0, v2, Lmq8;->w:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v1, p0}, Lmq8;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-static {}, Lrf2;->c()V

    .line 88
    .line 89
    .line 90
    :goto_1
    return-object v1

    .line 91
    :pswitch_1
    check-cast v2, Lmq8;

    .line 92
    .line 93
    iget-object v0, v2, Lmq8;->w:Ljava/lang/String;

    .line 94
    .line 95
    iget v2, p0, Lhq8;->x:I

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-ge v2, v0, :cond_2

    .line 102
    .line 103
    add-int/lit8 v0, v2, 0x1

    .line 104
    .line 105
    new-instance v1, Lmq8;

    .line 106
    .line 107
    iput v0, p0, Lhq8;->x:I

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {v1, p0}, Lmq8;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-static {}, Lrf2;->c()V

    .line 118
    .line 119
    .line 120
    :goto_2
    return-object v1

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
