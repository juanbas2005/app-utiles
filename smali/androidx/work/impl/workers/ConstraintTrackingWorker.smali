.class public final Landroidx/work/impl/workers/ConstraintTrackingWorker;
.super Landroidx/work/CoroutineWorker;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/work/impl/workers/ConstraintTrackingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "z21",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

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
.end method

.method public static final f(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lt84;Lzy2;Lbe8;Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La31;

    .line 7
    .line 8
    iget v1, v0, La31;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La31;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La31;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La31;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La31;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget p4, v0, La31;->B:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p4, :cond_2

    .line 32
    .line 33
    if-ne p4, v2, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lf7;

    .line 49
    .line 50
    invoke-direct {p0, p1, p2, p3, v1}, Lf7;-><init>(Lt84;Lzy2;Lbe8;Lf61;)V

    .line 51
    .line 52
    .line 53
    iput v2, v0, La31;->B:I

    .line 54
    .line 55
    invoke-static {p0, v0}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, Lp81;->w:Lp81;

    .line 60
    .line 61
    if-ne p0, p1, :cond_3

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-object p0
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
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
.end method

.method public static final g(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lh61;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v7, v1, Lt84;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 8
    .line 9
    iget-object v3, v1, Lt84;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v4, v1, Lt84;->b:Landroidx/work/WorkerParameters;

    .line 12
    .line 13
    instance-of v5, v0, Lb31;

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    move-object v5, v0

    .line 18
    check-cast v5, Lb31;

    .line 19
    .line 20
    iget v6, v5, Lb31;->C:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v6, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v6, v8

    .line 29
    iput v6, v5, Lb31;->C:I

    .line 30
    .line 31
    :goto_0
    move-object v8, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v5, Lb31;

    .line 34
    .line 35
    invoke-direct {v5, v1, v0}, Lb31;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lh61;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v0, v8, Lb31;->A:Ljava/lang/Object;

    .line 40
    .line 41
    iget v5, v8, Lb31;->C:I

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    if-ne v5, v10, :cond_1

    .line 48
    .line 49
    iget-object v1, v8, Lb31;->z:Lt84;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    move-object/from16 p1, v9

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object/from16 p1, v9

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :cond_2
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v4, Landroidx/work/WorkerParameters;->b:Lce1;

    .line 73
    .line 74
    const-string v5, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 75
    .line 76
    iget-object v0, v0, Lce1;->a:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    instance-of v5, v0, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    check-cast v0, Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v0, v9

    .line 90
    :goto_2
    const-string v5, "No worker to delegate to."

    .line 91
    .line 92
    if-eqz v0, :cond_11

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_4

    .line 99
    .line 100
    goto/16 :goto_a

    .line 101
    .line 102
    :cond_4
    invoke-static {v3}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget-object v11, v6, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 107
    .line 108
    invoke-virtual {v11}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    iget-object v12, v4, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 113
    .line 114
    invoke-virtual {v12}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11, v12}, Lfe8;->e(Ljava/lang/String;)Lbe8;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    if-nez v11, :cond_5

    .line 126
    .line 127
    new-instance v0, Lp84;

    .line 128
    .line 129
    invoke-direct {v0}, Lp84;-><init>()V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_5
    new-instance v12, Lzy2;

    .line 134
    .line 135
    iget-object v13, v6, Lnd8;->j:Lzk7;

    .line 136
    .line 137
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-direct {v12, v13}, Lzy2;-><init>(Lzk7;)V

    .line 141
    .line 142
    .line 143
    new-instance v14, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v13, v12, Lzy2;->w:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-eqz v15, :cond_7

    .line 159
    .line 160
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    move-object/from16 p1, v9

    .line 165
    .line 166
    move-object v9, v15

    .line 167
    check-cast v9, Lj21;

    .line 168
    .line 169
    invoke-interface {v9, v11}, Lj21;->a(Lbe8;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-eqz v9, :cond_6

    .line 174
    .line 175
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_6
    move-object/from16 v9, p1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_7
    move-object/from16 p1, v9

    .line 182
    .line 183
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-nez v9, :cond_8

    .line 188
    .line 189
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    sget-object v13, Lbd8;->a:Ljava/lang/String;

    .line 194
    .line 195
    new-instance v15, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v10, "Work "

    .line 198
    .line 199
    invoke-direct {v15, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iget-object v10, v11, Lbe8;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v10, " constrained by "

    .line 208
    .line 209
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    new-instance v10, Lrb8;

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    invoke-direct {v10, v1}, Lrb8;-><init>(I)V

    .line 216
    .line 217
    .line 218
    const/16 v19, 0x1f

    .line 219
    .line 220
    move-object v1, v15

    .line 221
    const/4 v15, 0x0

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    move-object/from16 v18, v10

    .line 227
    .line 228
    invoke-static/range {v14 .. v19}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v9, v13, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-nez v1, :cond_9

    .line 247
    .line 248
    sget-object v1, Lf31;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    new-instance v3, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v4, "Constraints not met for delegate "

    .line 257
    .line 258
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v0, ". Requesting retry."

    .line 265
    .line 266
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v2, v1, v0}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    new-instance v0, Lq84;

    .line 277
    .line 278
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    return-object v0

    .line 282
    :cond_9
    sget-object v1, Lf31;->a:Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    const-string v10, "Constraints met for delegate "

    .line 289
    .line 290
    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    invoke-virtual {v9, v1, v10}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :try_start_1
    iget-object v1, v4, Landroidx/work/WorkerParameters;->g:Ltd0;

    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v3, v0, v2}, Ltd0;->s(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lt84;

    .line 303
    .line 304
    .line 305
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 306
    iget-object v0, v2, Landroidx/work/WorkerParameters;->f:Lqd8;

    .line 307
    .line 308
    iget-object v0, v0, Lqd8;->d:Liy2;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    :try_start_2
    invoke-static {v0}, Lwe;->l(Ljava/util/concurrent/Executor;)Lh81;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    new-instance v0, Lng;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3

    .line 318
    .line 319
    const/4 v5, 0x0

    .line 320
    const/4 v6, 0x5

    .line 321
    move-object v2, v1

    .line 322
    move-object v4, v11

    .line 323
    move-object v3, v12

    .line 324
    move-object/from16 v1, p0

    .line 325
    .line 326
    :try_start_3
    invoke-direct/range {v0 .. v6}, Lng;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 327
    .line 328
    .line 329
    iput-object v2, v8, Lb31;->z:Lt84;

    .line 330
    .line 331
    const/4 v1, 0x1

    .line 332
    iput v1, v8, Lb31;->C:I

    .line 333
    .line 334
    invoke-static {v9, v0, v8}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 338
    sget-object v1, Lp81;->w:Lp81;

    .line 339
    .line 340
    if-ne v0, v1, :cond_a

    .line 341
    .line 342
    return-object v1

    .line 343
    :cond_a
    move-object v1, v2

    .line 344
    :goto_4
    :try_start_4
    check-cast v0, Ls84;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1

    .line 345
    .line 346
    return-object v0

    .line 347
    :catch_1
    move-exception v0

    .line 348
    goto :goto_5

    .line 349
    :catch_2
    move-exception v0

    .line 350
    move-object v1, v2

    .line 351
    goto :goto_5

    .line 352
    :catch_3
    move-exception v0

    .line 353
    move-object v2, v1

    .line 354
    :goto_5
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    const/16 v3, -0x100

    .line 359
    .line 360
    if-eq v2, v3, :cond_b

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_b
    instance-of v2, v0, Lz21;

    .line 364
    .line 365
    if-eqz v2, :cond_f

    .line 366
    .line 367
    :goto_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 368
    .line 369
    const/16 v4, 0x1f

    .line 370
    .line 371
    if-ge v2, v4, :cond_c

    .line 372
    .line 373
    const/16 v2, -0x200

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_c
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eq v2, v3, :cond_d

    .line 381
    .line 382
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    goto :goto_7

    .line 387
    :cond_d
    instance-of v2, v0, Lz21;

    .line 388
    .line 389
    if-eqz v2, :cond_e

    .line 390
    .line 391
    move-object v2, v0

    .line 392
    check-cast v2, Lz21;

    .line 393
    .line 394
    iget v2, v2, Lz21;->w:I

    .line 395
    .line 396
    :goto_7
    iget-object v1, v1, Lt84;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 397
    .line 398
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 399
    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_e
    const-string v0, "Unreachable"

    .line 403
    .line 404
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    return-object p1

    .line 408
    :cond_f
    :goto_8
    instance-of v1, v0, Lz21;

    .line 409
    .line 410
    if-eqz v1, :cond_10

    .line 411
    .line 412
    new-instance v0, Lq84;

    .line 413
    .line 414
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 415
    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_10
    throw v0

    .line 419
    :catchall_0
    sget-object v0, Lf31;->a:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-virtual {v1, v0, v5}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    iget-object v0, v6, Lnd8;->b:Lf01;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    new-instance v0, Lp84;

    .line 434
    .line 435
    invoke-direct {v0}, Lp84;-><init>()V

    .line 436
    .line 437
    .line 438
    :goto_9
    return-object v0

    .line 439
    :cond_11
    :goto_a
    sget-object v0, Lf31;->a:Ljava/lang/String;

    .line 440
    .line 441
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v1, v0, v5}, Lbc4;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    new-instance v0, Lp84;

    .line 449
    .line 450
    invoke-direct {v0}, Lp84;-><init>()V

    .line 451
    .line 452
    .line 453
    return-object v0
    .line 454
.end method


# virtual methods
.method public final c(Lf61;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lt84;->b:Landroidx/work/WorkerParameters;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/WorkerParameters;->d:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lwe;->l(Ljava/util/concurrent/Executor;)Lh81;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lot;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-direct {v1, p0, v2, v3}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
