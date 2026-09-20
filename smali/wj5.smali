.class public final Lwj5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Le81;

.field public final b:Landroid/content/Context;

.field public final c:Lhj6;

.field public final d:Lya4;

.field public final e:Lqq4;

.field public f:Landroid/view/textclassifier/TextClassifier;

.field public final g:Led5;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le81;Landroid/content/Context;Lhj6;Lya4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwj5;->a:Le81;

    .line 5
    .line 6
    iput-object p2, p0, Lwj5;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwj5;->c:Lhj6;

    .line 9
    .line 10
    iput-object p4, p0, Lwj5;->d:Lya4;

    .line 11
    .line 12
    new-instance p1, Lqq4;

    .line 13
    .line 14
    invoke-direct {p1}, Lqq4;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lwj5;->e:Lqq4;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lwj5;->g:Led5;

    .line 25
    .line 26
    new-instance p1, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lwj5;->h:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
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

.method public static final a(Lwj5;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lh61;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    iget-object v2, v0, Lwj5;->e:Lqq4;

    .line 6
    .line 7
    iget-object v3, v0, Lwj5;->g:Led5;

    .line 8
    .line 9
    instance-of v4, v1, Luj5;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Luj5;

    .line 15
    .line 16
    iget v5, v4, Luj5;->F:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Luj5;->F:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Luj5;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1}, Luj5;-><init>(Lwj5;Lh61;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v4, Luj5;->D:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Luj5;->F:I

    .line 36
    .line 37
    sget-object v6, Lvs7;->a:Lvs7;

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    sget-object v10, Lp81;->w:Lp81;

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    if-eq v5, v8, :cond_2

    .line 47
    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    iget-object v0, v4, Luj5;->A:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Loq4;

    .line 54
    .line 55
    iget-object v0, v4, Luj5;->z:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Luc7;

    .line 58
    .line 59
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v1, v9

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v9

    .line 71
    :cond_2
    iget-wide v11, v4, Luj5;->C:J

    .line 72
    .line 73
    iget-object v5, v4, Luj5;->B:Lqq4;

    .line 74
    .line 75
    iget-object v13, v4, Luj5;->A:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v13}, Lpa4;->i(Ljava/lang/Object;)Landroid/view/textclassifier/TextClassifier;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    iget-object v14, v4, Luj5;->z:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v14, Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object/from16 v1, p1

    .line 93
    .line 94
    iput-object v1, v4, Luj5;->z:Ljava/lang/Object;

    .line 95
    .line 96
    move-object/from16 v5, p4

    .line 97
    .line 98
    iput-object v5, v4, Luj5;->A:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v2, v4, Luj5;->B:Lqq4;

    .line 101
    .line 102
    move-wide/from16 v11, p2

    .line 103
    .line 104
    iput-wide v11, v4, Luj5;->C:J

    .line 105
    .line 106
    iput v8, v4, Luj5;->F:I

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Lqq4;->a(Lf61;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    if-ne v13, v10, :cond_4

    .line 113
    .line 114
    move-object v15, v10

    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    move-object v14, v1

    .line 118
    move-object v13, v5

    .line 119
    move-object v5, v2

    .line 120
    :goto_1
    :try_start_0
    invoke-virtual {v3}, Led5;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Luc7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    :try_start_1
    sget-object v15, Lxj5;->a:Lt37;

    .line 129
    .line 130
    move-object v15, v10

    .line 131
    iget-wide v9, v1, Luc7;->b:J

    .line 132
    .line 133
    invoke-static {v11, v12, v9, v10}, Llg7;->b(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_5

    .line 138
    .line 139
    iget-object v1, v1, Luc7;->a:Ljava/lang/CharSequence;

    .line 140
    .line 141
    invoke-static {v14, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    move v1, v8

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    const/4 v1, 0x0

    .line 150
    :goto_2
    if-ne v1, v8, :cond_6

    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    invoke-interface {v5, v1}, Loq4;->k(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-object v6

    .line 157
    :cond_6
    const/4 v1, 0x0

    .line 158
    goto :goto_3

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    const/4 v1, 0x0

    .line 161
    goto :goto_6

    .line 162
    :cond_7
    move-object v15, v10

    .line 163
    move-object v1, v9

    .line 164
    :goto_3
    invoke-interface {v5, v1}, Loq4;->k(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-static {}, Ltj5;->q()V

    .line 168
    .line 169
    .line 170
    invoke-static {v11, v12}, Llg7;->f(J)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {v11, v12}, Llg7;->e(J)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-static {v14, v1, v5}, Ltj5;->h(Ljava/lang/CharSequence;II)Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0}, Lwj5;->c()Landroid/os/LocaleList;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-static {v1, v5}, Lq4;->h(Landroid/view/textclassifier/TextClassification$Request$Builder;Landroid/os/LocaleList;)Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v1}, Lq4;->i(Landroid/view/textclassifier/TextClassification$Request$Builder;)Landroid/view/textclassifier/TextClassification$Request;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v13, v1}, Lq4;->j(Landroid/view/textclassifier/TextClassifier;Landroid/view/textclassifier/TextClassification$Request;)Landroid/view/textclassifier/TextClassification;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v14, v11, v12, v1}, Lwj5;->b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)Luc7;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iput-object v0, v4, Luj5;->z:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v2, v4, Luj5;->A:Ljava/lang/Object;

    .line 205
    .line 206
    const/4 v1, 0x0

    .line 207
    iput-object v1, v4, Luj5;->B:Lqq4;

    .line 208
    .line 209
    iput v7, v4, Luj5;->F:I

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Lqq4;->a(Lf61;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    if-ne v4, v15, :cond_8

    .line 216
    .line 217
    :goto_4
    return-object v15

    .line 218
    :cond_8
    :goto_5
    :try_start_2
    invoke-virtual {v3, v0}, Led5;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 219
    .line 220
    .line 221
    invoke-interface {v2, v1}, Loq4;->k(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-object v6

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    invoke-interface {v2, v1}, Loq4;->k(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :catchall_2
    move-exception v0

    .line 231
    move-object v1, v9

    .line 232
    :goto_6
    invoke-interface {v5, v1}, Loq4;->k(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    throw v0
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
.end method


# virtual methods
.method public final b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)Luc7;
    .locals 7

    .line 1
    invoke-static {p4}, Led7;->d(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v6, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_3

    .line 16
    .line 17
    invoke-static {p4}, Led7;->d(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Lpc7;->e(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {v3}, Ltj5;->w(Landroid/app/RemoteAction;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move-object v2, v4

    .line 40
    :cond_1
    :goto_1
    invoke-static {v2}, Lpc7;->e(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v2}, Lpa4;->g(Landroid/app/RemoteAction;)Landroid/graphics/drawable/Icon;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v3, p0, Lwj5;->b:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_2
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    new-instance v1, Luc7;

    .line 65
    .line 66
    move-object v2, p1

    .line 67
    move-wide v3, p2

    .line 68
    move-object v5, p4

    .line 69
    invoke-direct/range {v1 .. v6}, Luc7;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    return-object v1
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

.method public final c()Landroid/os/LocaleList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lwj5;->d:Lya4;

    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-static {p0, v2}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lya4;->w:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lxa4;

    .line 34
    .line 35
    iget-object v2, v2, Lxa4;->a:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-array p0, v0, [Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Ljava/util/Locale;

    .line 48
    .line 49
    array-length v0, p0

    .line 50
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, [Ljava/util/Locale;

    .line 55
    .line 56
    new-instance v0, Landroid/os/LocaleList;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    new-instance p0, Landroid/os/LocaleList;

    .line 63
    .line 64
    sget-object v1, Lkj5;->a:Lwr0;

    .line 65
    .line 66
    invoke-virtual {v1}, Lwr0;->G()Lya4;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, Lya4;->w:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lxa4;

    .line 77
    .line 78
    iget-object v0, v0, Lxa4;->a:Ljava/util/Locale;

    .line 79
    .line 80
    filled-new-array {v0}, [Ljava/util/Locale;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p0, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 85
    .line 86
    .line 87
    return-object p0
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
