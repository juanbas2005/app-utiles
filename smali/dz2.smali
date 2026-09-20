.class public final Ldz2;
.super Lin8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lwc5;


# instance fields
.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldz2;->x:I

    .line 2
    .line 3
    const/16 p1, 0x8

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lin8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public R0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Ldz2;->x:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lin8;->R0(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, Lb53;->a:Ljava/util/List;

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    move v0, p0

    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge p0, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/lit8 v2, v0, 0x1

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    invoke-static {v1, v3}, Lsg3;->k(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lez v3, :cond_0

    .line 36
    .line 37
    const-string v3, "\"(),/:;<=>?@[\\]{}"

    .line 38
    .line 39
    invoke-static {v3, v1}, Ld57;->y0(Ljava/lang/CharSequence;C)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    add-int/lit8 p0, p0, 0x1

    .line 46
    .line 47
    move v0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Lio/ktor/http/IllegalHeaderNameException;

    .line 50
    .line 51
    const-string v1, "Header name \'"

    .line 52
    .line 53
    const-string v2, "\' contains illegal character \'"

    .line 54
    .line 55
    invoke-static {v1, p1, v2}, Lb81;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, "\' (code "

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    and-int/lit16 p1, p1, 0xff

    .line 76
    .line 77
    const/16 v0, 0x29

    .line 78
    .line 79
    invoke-static {v1, p1, v0}, Lf21;->j(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_1
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public S0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Ldz2;->x:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lin8;->S0(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, Lb53;->a:Ljava/util/List;

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    move v0, p0

    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge p0, v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/lit8 v2, v0, 0x1

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    invoke-static {v1, v3}, Lsg3;->k(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-gez v3, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x9

    .line 38
    .line 39
    if-ne v1, v3, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    new-instance p0, Lio/ktor/http/IllegalHeaderValueException;

    .line 43
    .line 44
    const-string v1, "Header value \'"

    .line 45
    .line 46
    const-string v2, "\' contains illegal character \'"

    .line 47
    .line 48
    invoke-static {v1, p1, v2}, Lb81;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, "\' (code "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    and-int/lit16 p1, p1, 0xff

    .line 69
    .line 70
    const/16 v0, 0x29

    .line 71
    .line 72
    invoke-static {v1, p1, v0}, Lf21;->j(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_1
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 81
    .line 82
    move v0, v2

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public d1()Lgz2;
    .locals 2

    .line 1
    new-instance v0, Lgz2;

    .line 2
    .line 3
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Lb57;-><init>(Ljava/util/Map;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
