.class public final Lbi4;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lbi4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lbi4;->x:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lbi4;->y:Ljava/lang/Object;

    .line 6
    .line 7
    iput p3, p0, Lbi4;->z:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lbi4;->w:I

    .line 2
    .line 3
    sget-object v1, La42;->w:La42;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lbi4;->z:I

    .line 7
    .line 8
    iget-object v4, p0, Lbi4;->y:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lbi4;->x:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lu72;

    .line 16
    .line 17
    check-cast v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lg3;

    .line 24
    .line 25
    iget-object v1, v0, Lg3;->c:Lsp7;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    move v1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v3

    .line 34
    :goto_0
    iget-object p0, p0, Lu72;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljm;

    .line 37
    .line 38
    sget-object v5, Ljm;->B:Ljm;

    .line 39
    .line 40
    if-ne p0, v5, :cond_1

    .line 41
    .line 42
    move v3, v4

    .line 43
    :cond_1
    if-nez v1, :cond_3

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object p0, Ljm;->A:Ljm;

    .line 49
    .line 50
    :cond_3
    :goto_1
    iget-object v0, v0, Lg3;->b:Lak3;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    iget-object v0, v0, Lak3;->a:Ljava/util/EnumMap;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v2, p0

    .line 61
    check-cast v2, Lki3;

    .line 62
    .line 63
    :cond_4
    return-object v2

    .line 64
    :pswitch_0
    check-cast p0, Lei4;

    .line 65
    .line 66
    check-cast v4, Lk2;

    .line 67
    .line 68
    iget-object v0, p0, Lei4;->a:Lz00;

    .line 69
    .line 70
    iget-object v5, v0, Lz00;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, Lvj1;

    .line 73
    .line 74
    invoke-virtual {p0, v5}, Lei4;->a(Lvj1;)Lst5;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    iget-object v0, v0, Lz00;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lws1;

    .line 83
    .line 84
    iget-object v0, v0, Lws1;->e:Lzl;

    .line 85
    .line 86
    invoke-interface {v0, p0, v4, v3}, Lim;->g(Lst5;Lk2;I)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :cond_5
    if-nez v2, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move-object v1, v2

    .line 94
    :goto_2
    return-object v1

    .line 95
    :pswitch_1
    check-cast p0, Lei4;

    .line 96
    .line 97
    check-cast v4, Lk2;

    .line 98
    .line 99
    iget-object v0, p0, Lei4;->a:Lz00;

    .line 100
    .line 101
    iget-object v5, v0, Lz00;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Lvj1;

    .line 104
    .line 105
    invoke-virtual {p0, v5}, Lei4;->a(Lvj1;)Lst5;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    iget-object v0, v0, Lz00;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lws1;

    .line 114
    .line 115
    iget-object v0, v0, Lws1;->e:Lzl;

    .line 116
    .line 117
    invoke-interface {v0, p0, v4, v3}, Lim;->b(Lst5;Lk2;I)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :cond_7
    if-nez v2, :cond_8

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    move-object v1, v2

    .line 129
    :goto_3
    return-object v1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
