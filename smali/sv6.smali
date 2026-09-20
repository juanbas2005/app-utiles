.class public final Lsv6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic A:Ljava/util/AbstractMap;

.field public final synthetic w:I

.field public x:I

.field public y:Z

.field public z:Ljava/util/Iterator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/AbstractMap;I)V
    .locals 0

    .line 16
    iput p2, p0, Lsv6;->w:I

    iput-object p1, p0, Lsv6;->A:Ljava/util/AbstractMap;

    const/4 p1, -0x1

    iput p1, p0, Lsv6;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lym8;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lsv6;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lsv6;->x:I

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
.end method


# virtual methods
.method public a()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lsv6;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    check-cast v1, Lnv6;

    .line 13
    .line 14
    iget-object v0, v1, Lnv6;->x:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    iget-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    check-cast v1, Lmv6;

    .line 34
    .line 35
    iget-object v0, v1, Lmv6;->y:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 46
    .line 47
    :cond_1
    iget-object p0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    iget-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    check-cast v1, Llv6;

    .line 55
    .line 56
    iget-object v0, v1, Llv6;->y:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 67
    .line 68
    :cond_2
    iget-object p0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public b()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 6
    .line 7
    check-cast v0, Lym8;

    .line 8
    .line 9
    iget-object v0, v0, Lym8;->y:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lsv6;->z:Ljava/util/Iterator;

    .line 22
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

.method public final hasNext()Z
    .locals 5

    .line 1
    iget v0, p0, Lsv6;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lsv6;->x:I

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    check-cast v1, Lym8;

    .line 14
    .line 15
    iget v4, v1, Lym8;->x:I

    .line 16
    .line 17
    if-lt v0, v4, :cond_1

    .line 18
    .line 19
    iget-object v0, v1, Lym8;->y:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lsv6;->b()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v3

    .line 39
    :cond_1
    :goto_0
    return v2

    .line 40
    :pswitch_0
    iget v0, p0, Lsv6;->x:I

    .line 41
    .line 42
    add-int/2addr v0, v2

    .line 43
    check-cast v1, Lnv6;

    .line 44
    .line 45
    iget-object v4, v1, Lnv6;->w:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-lt v0, v4, :cond_3

    .line 52
    .line 53
    iget-object v0, v1, Lnv6;->x:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v2, v3

    .line 73
    :cond_3
    :goto_1
    return v2

    .line 74
    :pswitch_1
    iget v0, p0, Lsv6;->x:I

    .line 75
    .line 76
    add-int/2addr v0, v2

    .line 77
    check-cast v1, Lmv6;

    .line 78
    .line 79
    iget-object v1, v1, Lmv6;->x:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-lt v0, v1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v2, v3

    .line 99
    :cond_5
    :goto_2
    return v2

    .line 100
    :pswitch_2
    iget v0, p0, Lsv6;->x:I

    .line 101
    .line 102
    add-int/2addr v0, v2

    .line 103
    check-cast v1, Llv6;

    .line 104
    .line 105
    iget-object v4, v1, Llv6;->x:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-lt v0, v4, :cond_7

    .line 112
    .line 113
    iget-object v0, v1, Llv6;->y:Ljava/util/Map;

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_6

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v2, v3

    .line 133
    :cond_7
    :goto_3
    return v2

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lsv6;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iput-boolean v2, p0, Lsv6;->y:Z

    .line 10
    .line 11
    iget v0, p0, Lsv6;->x:I

    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lsv6;->x:I

    .line 15
    .line 16
    check-cast v1, Lym8;

    .line 17
    .line 18
    iget v2, v1, Lym8;->x:I

    .line 19
    .line 20
    if-ge v0, v2, :cond_0

    .line 21
    .line 22
    iget-object p0, v1, Lym8;->w:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object p0, p0, v0

    .line 25
    .line 26
    check-cast p0, Lzm8;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lsv6;->b()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/util/Map$Entry;

    .line 38
    .line 39
    :goto_0
    return-object p0

    .line 40
    :pswitch_0
    iput-boolean v2, p0, Lsv6;->y:Z

    .line 41
    .line 42
    iget v0, p0, Lsv6;->x:I

    .line 43
    .line 44
    add-int/2addr v0, v2

    .line 45
    iput v0, p0, Lsv6;->x:I

    .line 46
    .line 47
    check-cast v1, Lnv6;

    .line 48
    .line 49
    iget-object v2, v1, Lnv6;->w:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-ge v0, v2, :cond_1

    .line 56
    .line 57
    iget-object v0, v1, Lnv6;->w:Ljava/util/List;

    .line 58
    .line 59
    iget p0, p0, Lsv6;->x:I

    .line 60
    .line 61
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/util/Map$Entry;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/util/Map$Entry;

    .line 77
    .line 78
    :goto_1
    return-object p0

    .line 79
    :pswitch_1
    iput-boolean v2, p0, Lsv6;->y:Z

    .line 80
    .line 81
    iget v0, p0, Lsv6;->x:I

    .line 82
    .line 83
    add-int/2addr v0, v2

    .line 84
    iput v0, p0, Lsv6;->x:I

    .line 85
    .line 86
    check-cast v1, Lmv6;

    .line 87
    .line 88
    iget-object v2, v1, Lmv6;->x:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-ge v0, v2, :cond_2

    .line 95
    .line 96
    iget-object v0, v1, Lmv6;->x:Ljava/util/List;

    .line 97
    .line 98
    iget p0, p0, Lsv6;->x:I

    .line 99
    .line 100
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Ljava/util/Map$Entry;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Ljava/util/Map$Entry;

    .line 116
    .line 117
    :goto_2
    return-object p0

    .line 118
    :pswitch_2
    iput-boolean v2, p0, Lsv6;->y:Z

    .line 119
    .line 120
    iget v0, p0, Lsv6;->x:I

    .line 121
    .line 122
    add-int/2addr v0, v2

    .line 123
    iput v0, p0, Lsv6;->x:I

    .line 124
    .line 125
    check-cast v1, Llv6;

    .line 126
    .line 127
    iget-object v2, v1, Llv6;->x:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-ge v0, v2, :cond_3

    .line 134
    .line 135
    iget-object v0, v1, Llv6;->x:Ljava/util/List;

    .line 136
    .line 137
    iget p0, p0, Lsv6;->x:I

    .line 138
    .line 139
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Ljava/util/Map$Entry;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ljava/util/Map$Entry;

    .line 155
    .line 156
    :goto_3
    return-object p0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final remove()V
    .locals 4

    .line 1
    iget v0, p0, Lsv6;->w:I

    .line 2
    .line 3
    const-string v1, "remove() was called before next()"

    .line 4
    .line 5
    iget-object v2, p0, Lsv6;->A:Ljava/util/AbstractMap;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lsv6;->y:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-boolean v3, p0, Lsv6;->y:Z

    .line 16
    .line 17
    check-cast v2, Lym8;

    .line 18
    .line 19
    invoke-virtual {v2}, Lym8;->g()V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lsv6;->x:I

    .line 23
    .line 24
    iget v1, v2, Lym8;->x:I

    .line 25
    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v0, -0x1

    .line 29
    .line 30
    iput v1, p0, Lsv6;->x:I

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lym8;->e(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lsv6;->b()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    check-cast v2, Lnv6;

    .line 49
    .line 50
    iget-boolean v0, p0, Lsv6;->y:Z

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iput-boolean v3, p0, Lsv6;->y:Z

    .line 55
    .line 56
    sget v0, Lnv6;->B:I

    .line 57
    .line 58
    invoke-virtual {v2}, Lnv6;->b()V

    .line 59
    .line 60
    .line 61
    iget v0, p0, Lsv6;->x:I

    .line 62
    .line 63
    iget-object v1, v2, Lnv6;->w:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-ge v0, v1, :cond_2

    .line 70
    .line 71
    iget v0, p0, Lsv6;->x:I

    .line 72
    .line 73
    add-int/lit8 v1, v0, -0x1

    .line 74
    .line 75
    iput v1, p0, Lsv6;->x:I

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lnv6;->i(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :pswitch_1
    check-cast v2, Lmv6;

    .line 94
    .line 95
    iget-boolean v0, p0, Lsv6;->y:Z

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    iput-boolean v3, p0, Lsv6;->y:Z

    .line 100
    .line 101
    sget v0, Lmv6;->B:I

    .line 102
    .line 103
    invoke-virtual {v2}, Lmv6;->b()V

    .line 104
    .line 105
    .line 106
    iget v0, p0, Lsv6;->x:I

    .line 107
    .line 108
    iget-object v1, v2, Lmv6;->x:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-ge v0, v1, :cond_4

    .line 115
    .line 116
    iget v0, p0, Lsv6;->x:I

    .line 117
    .line 118
    add-int/lit8 v1, v0, -0x1

    .line 119
    .line 120
    iput v1, p0, Lsv6;->x:I

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Lmv6;->g(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    return-void

    .line 138
    :pswitch_2
    check-cast v2, Llv6;

    .line 139
    .line 140
    iget-boolean v0, p0, Lsv6;->y:Z

    .line 141
    .line 142
    if-eqz v0, :cond_7

    .line 143
    .line 144
    iput-boolean v3, p0, Lsv6;->y:Z

    .line 145
    .line 146
    sget v0, Llv6;->C:I

    .line 147
    .line 148
    invoke-virtual {v2}, Llv6;->b()V

    .line 149
    .line 150
    .line 151
    iget v0, p0, Lsv6;->x:I

    .line 152
    .line 153
    iget-object v1, v2, Llv6;->x:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-ge v0, v1, :cond_6

    .line 160
    .line 161
    iget v0, p0, Lsv6;->x:I

    .line 162
    .line 163
    add-int/lit8 v1, v0, -0x1

    .line 164
    .line 165
    iput v1, p0, Lsv6;->x:I

    .line 166
    .line 167
    invoke-virtual {v2, v0}, Llv6;->h(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-virtual {p0}, Lsv6;->a()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :goto_3
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method
