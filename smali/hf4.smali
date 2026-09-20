.class public final Lhf4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# instance fields
.field public final a:Lzr3;

.field public final b:Lzr3;

.field public final synthetic c:I

.field public final d:Lnl6;


# direct methods
.method public constructor <init>(Lzr3;Lzr3;B)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lhf4;->a:Lzr3;

    .line 51
    iput-object p2, p0, Lhf4;->b:Lzr3;

    return-void
.end method

.method public constructor <init>(Lzr3;Lzr3;I)V
    .locals 3

    .line 1
    iput p3, p0, Lhf4;->c:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0}, Lhf4;-><init>(Lzr3;Lzr3;B)V

    .line 8
    .line 9
    .line 10
    sget-object p3, Ln57;->n:Ln57;

    .line 11
    .line 12
    new-array v1, v0, [Lll6;

    .line 13
    .line 14
    new-instance v2, Lff4;

    .line 15
    .line 16
    invoke-direct {v2, p1, p2, v0}, Lff4;-><init>(Lzr3;Lzr3;I)V

    .line 17
    .line 18
    .line 19
    const-string p1, "kotlin.collections.Map.Entry"

    .line 20
    .line 21
    invoke-static {p1, p3, v1, v2}, Lb85;->f(Ljava/lang/String;Ln85;[Lll6;Lvr2;)Lnl6;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lhf4;->d:Lnl6;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lhf4;-><init>(Lzr3;Lzr3;B)V

    .line 29
    .line 30
    .line 31
    new-array p3, v0, [Lll6;

    .line 32
    .line 33
    new-instance v0, Lff4;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p1, p2, v1}, Lff4;-><init>(Lzr3;Lzr3;I)V

    .line 37
    .line 38
    .line 39
    const-string p1, "kotlin.Pair"

    .line 40
    .line 41
    invoke-static {p1, p3, v0}, Lb85;->e(Ljava/lang/String;[Lll6;Lvr2;)Lnl6;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lhf4;->d:Lnl6;

    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Lsu0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {p1, v4}, Lgy0;->h(Lll6;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, -0x1

    .line 22
    if-eq v4, v5, :cond_2

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v4, v3, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object v6, p0, Lhf4;->b:Lzr3;

    .line 35
    .line 36
    check-cast v6, Lzr3;

    .line 37
    .line 38
    invoke-interface {p1, v4, v3, v6, v5}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 44
    .line 45
    const-string p1, "Invalid index: "

    .line 46
    .line 47
    invoke-static {v4, p1}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v4, p0, Lhf4;->a:Lzr3;

    .line 60
    .line 61
    check-cast v4, Lzr3;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-interface {p1, v2, v6, v4, v5}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-eq v2, v1, :cond_4

    .line 70
    .line 71
    if-eq v3, v1, :cond_3

    .line 72
    .line 73
    iget p0, p0, Lhf4;->c:I

    .line 74
    .line 75
    packed-switch p0, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    new-instance p0, Lyb5;

    .line 79
    .line 80
    invoke-direct {p0, v2, v3}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_0
    new-instance p0, Lgf4;

    .line 85
    .line 86
    invoke-direct {p0, v2, v3}, Lgf4;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-interface {p1, v0}, Lgy0;->b(Lll6;)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_3
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 94
    .line 95
    const-string p1, "Element \'value\' is missing"

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_4
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 102
    .line 103
    const-string p1, "Element \'key\' is missing"

    .line 104
    .line 105
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final getDescriptor()Lll6;
    .locals 1

    .line 1
    iget v0, p0, Lhf4;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhf4;->d:Lnl6;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lhf4;->d:Lnl6;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lj42;->c(Lll6;)Lhy0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lhf4;->a:Lzr3;

    .line 14
    .line 15
    check-cast v1, Lzr3;

    .line 16
    .line 17
    iget v2, p0, Lhf4;->c:I

    .line 18
    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v3, p2

    .line 23
    check-cast v3, Lyb5;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, v3, Lyb5;->w:Ljava/lang/Object;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_0
    move-object v3, p2

    .line 32
    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :goto_0
    const/4 v4, 0x0

    .line 42
    invoke-interface {p1, v0, v4, v1, v3}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Lhf4;->b:Lzr3;

    .line 50
    .line 51
    check-cast v1, Lzr3;

    .line 52
    .line 53
    packed-switch v2, :pswitch_data_1

    .line 54
    .line 55
    .line 56
    check-cast p2, Lyb5;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object p2, p2, Lyb5;->x:Ljava/lang/Object;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_1
    check-cast p2, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :goto_1
    const/4 v2, 0x1

    .line 74
    invoke-interface {p1, v0, v2, v1, p2}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 82
    .line 83
    .line 84
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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
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
