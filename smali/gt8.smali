.class public final Lgt8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lno7;

.field public b:Lno7;

.field public final c:Lcf4;

.field public final d:Lkc9;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Lno7;

    .line 2
    .line 3
    invoke-direct {v0}, Lno7;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgt8;->a:Lno7;

    .line 10
    .line 11
    iget-object v1, v0, Lno7;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lno7;

    .line 14
    .line 15
    invoke-virtual {v1}, Lno7;->k()Lno7;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lgt8;->b:Lno7;

    .line 20
    .line 21
    new-instance v1, Lcf4;

    .line 22
    .line 23
    const/16 v2, 0x1b

    .line 24
    .line 25
    invoke-direct {v1, v2}, Lcf4;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lgt8;->c:Lcf4;

    .line 29
    .line 30
    new-instance v1, Lkc9;

    .line 31
    .line 32
    invoke-direct {v1}, Lkc9;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lgt8;->d:Lkc9;

    .line 36
    .line 37
    new-instance v1, Lti8;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v1, p0, v2}, Lti8;-><init>(Lgt8;I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lno7;->A:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lay4;

    .line 46
    .line 47
    iget-object v2, v0, Lay4;->x:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/HashMap;

    .line 50
    .line 51
    const-string v3, "internal.registerCallback"

    .line 52
    .line 53
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    new-instance v1, Lti8;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-direct {v1, p0, v2}, Lti8;-><init>(Lgt8;I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v0, Lay4;->x:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Ljava/util/HashMap;

    .line 65
    .line 66
    const-string v0, "internal.eventLogger"

    .line 67
    .line 68
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-void
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


# virtual methods
.method public final a(Lwi8;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lgt8;->c:Lcf4;

    .line 2
    .line 3
    :try_start_0
    iput-object p1, v0, Lcf4;->x:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1}, Lwi8;->a()Lwi8;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lcf4;->y:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lgt8;->a:Lno7;

    .line 19
    .line 20
    iget-object p1, p1, Lno7;->z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lno7;

    .line 23
    .line 24
    const-string v1, "runtime.counter"

    .line 25
    .line 26
    new-instance v2, Lwn8;

    .line 27
    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-direct {v2, v3}, Lwn8;-><init>(Ljava/lang/Double;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1, v2}, Lno7;->m(Ljava/lang/String;Lbq8;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lgt8;->d:Lkc9;

    .line 41
    .line 42
    iget-object p0, p0, Lgt8;->b:Lno7;

    .line 43
    .line 44
    invoke-virtual {p0}, Lno7;->k()Lno7;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0, v0}, Lkc9;->a(Lno7;Lcf4;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lwi8;

    .line 54
    .line 55
    iget-object p1, v0, Lcf4;->x:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lwi8;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lwi8;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    iget-object p0, v0, Lcf4;->z:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzd;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p1
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

.method public final b(Lv29;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lgt8;->a:Lno7;

    .line 2
    .line 3
    iget-object v1, v0, Lno7;->y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lno7;

    .line 6
    .line 7
    invoke-virtual {v1}, Lno7;->k()Lno7;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lgt8;->b:Lno7;

    .line 12
    .line 13
    invoke-virtual {p1}, Lv29;->t()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lgt8;->b:Lno7;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    new-array v3, v3, [Lx29;

    .line 21
    .line 22
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, [Lx29;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lno7;->f(Lno7;[Lx29;)Lbq8;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    instance-of v1, v1, Lcn8;

    .line 33
    .line 34
    if-nez v1, :cond_6

    .line 35
    .line 36
    invoke-virtual {p1}, Lv29;->u()Lo29;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lo29;->t()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lq29;

    .line 59
    .line 60
    invoke-virtual {v1}, Lq29;->u()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1}, Lq29;->t()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lx29;

    .line 83
    .line 84
    iget-object v4, p0, Lgt8;->b:Lno7;

    .line 85
    .line 86
    filled-new-array {v3}, [Lx29;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v0, v4, v3}, Lno7;->f(Lno7;[Lx29;)Lbq8;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    instance-of v4, v3, Lvp8;

    .line 95
    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    const-string v4, "Rule function is undefined: "

    .line 99
    .line 100
    iget-object v5, p0, Lgt8;->b:Lno7;

    .line 101
    .line 102
    const-string v6, "Invalid function name: "

    .line 103
    .line 104
    invoke-virtual {v5, v1}, Lno7;->l(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-nez v7, :cond_1

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-virtual {v5, v1}, Lno7;->p(Ljava/lang/String;)Lbq8;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    instance-of v7, v5, Lro8;

    .line 117
    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    check-cast v5, Lro8;

    .line 121
    .line 122
    :goto_1
    if-eqz v5, :cond_2

    .line 123
    .line 124
    iget-object v4, p0, Lgt8;->b:Lno7;

    .line 125
    .line 126
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v5, v4, v3}, Lro8;->a(Lno7;Ljava/util/List;)Lbq8;

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0

    .line 148
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    const-string p1, "Invalid rule definition"

    .line 165
    .line 166
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_5
    return-void

    .line 171
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string p1, "Program loading failed"

    .line 174
    .line 175
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzd;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p1
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
.end method
