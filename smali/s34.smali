.class public final Ls34;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Luh6;


# static fields
.field public static final y:Lkg5;


# instance fields
.field public final a:Llm1;

.field public b:Z

.field public c:Lm34;

.field public d:Z

.field public final e:Lg04;

.field public final f:Led5;

.field public final g:Lap4;

.field public h:F

.field public i:Z

.field public final j:Lhn1;

.field public final k:Z

.field public l:Luy3;

.field public final m:Ll04;

.field public final n:Lf20;

.field public final o:Lwz0;

.field public final p:Lji8;

.field public final q:Lt24;

.field public final r:Lns8;

.field public final s:Lq24;

.field public final t:Laq4;

.field public final u:Led5;

.field public final v:Led5;

.field public final w:Laq4;

.field public final x:Lhv2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Luz1;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Luz1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ltm3;

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-direct {v1, v2}, Ltm3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Lgl0;->Z(Lvr2;Lgs2;)Lkg5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Ls34;->y:Lkg5;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(II)V
    .locals 3

    .line 1
    new-instance v0, Llm1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Llm1;->a:I

    .line 8
    .line 9
    iput v1, v0, Llm1;->c:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ls34;->a:Llm1;

    .line 15
    .line 16
    new-instance v0, Lg04;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p1, p2, v1}, Lg04;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ls34;->e:Lg04;

    .line 23
    .line 24
    sget-object p2, Lt34;->a:Lm34;

    .line 25
    .line 26
    sget-object v0, Ld63;->G:Ld63;

    .line 27
    .line 28
    new-instance v2, Led5;

    .line 29
    .line 30
    invoke-direct {v2, p2, v0}, Led5;-><init>(Ljava/lang/Object;Lux6;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ls34;->f:Led5;

    .line 34
    .line 35
    new-instance p2, Lap4;

    .line 36
    .line 37
    invoke-direct {p2}, Lap4;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Ls34;->g:Lap4;

    .line 41
    .line 42
    new-instance p2, Lh43;

    .line 43
    .line 44
    const/16 v0, 0xc

    .line 45
    .line 46
    invoke-direct {p2, v0, p0}, Lh43;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lhn1;

    .line 50
    .line 51
    invoke-direct {v0, p2}, Lhn1;-><init>(Lvr2;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Ls34;->j:Lhn1;

    .line 55
    .line 56
    iput-boolean v1, p0, Ls34;->k:Z

    .line 57
    .line 58
    new-instance p2, Ll04;

    .line 59
    .line 60
    invoke-direct {p2, p0, v1}, Ll04;-><init>(Luh6;I)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Ls34;->m:Ll04;

    .line 64
    .line 65
    new-instance p2, Lf20;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Ls34;->n:Lf20;

    .line 71
    .line 72
    new-instance p2, Lwz0;

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    invoke-direct {p2, v0}, Lwz0;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, Ls34;->o:Lwz0;

    .line 79
    .line 80
    new-instance p2, Lji8;

    .line 81
    .line 82
    const/16 v0, 0x1d

    .line 83
    .line 84
    invoke-direct {p2, v0}, Lji8;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Ls34;->p:Lji8;

    .line 88
    .line 89
    new-instance p2, Lt24;

    .line 90
    .line 91
    new-instance v0, Lah1;

    .line 92
    .line 93
    invoke-direct {v0, p0, p1}, Lah1;-><init>(Ls34;I)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p2, v0}, Lt24;-><init>(Lvr2;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Ls34;->q:Lt24;

    .line 100
    .line 101
    new-instance p1, Lns8;

    .line 102
    .line 103
    const/16 p2, 0x1b

    .line 104
    .line 105
    invoke-direct {p1, p2, p0}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, Ls34;->r:Lns8;

    .line 109
    .line 110
    new-instance p1, Lq24;

    .line 111
    .line 112
    invoke-direct {p1}, Lq24;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Ls34;->s:Lq24;

    .line 116
    .line 117
    invoke-static {}, Lc35;->e()Laq4;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, Ls34;->t:Laq4;

    .line 122
    .line 123
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    iput-object p2, p0, Ls34;->u:Led5;

    .line 130
    .line 131
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, Ls34;->v:Led5;

    .line 136
    .line 137
    invoke-static {}, Lc35;->e()Laq4;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Ls34;->w:Laq4;

    .line 142
    .line 143
    new-instance p1, Lhv2;

    .line 144
    .line 145
    const/16 p2, 0xa

    .line 146
    .line 147
    invoke-direct {p1, p2}, Lhv2;-><init>(I)V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Ls34;->x:Lhv2;

    .line 151
    .line 152
    return-void
    .line 153
.end method

.method public static l(Ls34;ILa97;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lci1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lci1;-><init>(Ls34;ILf61;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lhq4;->w:Lhq4;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p2}, Ls34;->d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lp81;->w:Lp81;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lvs7;->a:Lvs7;

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
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->j:Lhn1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhn1;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
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
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->v:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->u:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lr34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr34;

    .line 7
    .line 8
    iget v1, v0, Lr34;->D:I

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
    iput v1, v0, Lr34;->D:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr34;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lr34;-><init>(Ls34;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lr34;->B:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lr34;->D:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lp81;->w:Lp81;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_2
    iget-object p1, v0, Lr34;->A:La97;

    .line 51
    .line 52
    move-object p2, p1

    .line 53
    check-cast p2, Lgs2;

    .line 54
    .line 55
    iget-object p1, v0, Lr34;->z:Lhq4;

    .line 56
    .line 57
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p3, p0, Ls34;->f:Led5;

    .line 65
    .line 66
    invoke-virtual {p3}, Led5;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    sget-object v1, Lt34;->a:Lm34;

    .line 71
    .line 72
    if-ne p3, v1, :cond_4

    .line 73
    .line 74
    iput-object p1, v0, Lr34;->z:Lhq4;

    .line 75
    .line 76
    move-object p3, p2

    .line 77
    check-cast p3, La97;

    .line 78
    .line 79
    iput-object p3, v0, Lr34;->A:La97;

    .line 80
    .line 81
    iput v4, v0, Lr34;->D:I

    .line 82
    .line 83
    iget-object p3, p0, Ls34;->n:Lf20;

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Lf20;->i(Lh61;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-ne p3, v5, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    iput-object v2, v0, Lr34;->z:Lhq4;

    .line 93
    .line 94
    iput-object v2, v0, Lr34;->A:La97;

    .line 95
    .line 96
    iput v3, v0, Lr34;->D:I

    .line 97
    .line 98
    iget-object p0, p0, Ls34;->j:Lhn1;

    .line 99
    .line 100
    invoke-virtual {p0, p1, p2, v0}, Lhn1;->d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v5, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v5

    .line 107
    :cond_5
    :goto_3
    sget-object p0, Lvs7;->a:Lvs7;

    .line 108
    .line 109
    return-object p0
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
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->j:Lhn1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lhn1;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
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

.method public final f(ILh61;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lp34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lp34;

    .line 7
    .line 8
    iget v1, v0, Lp34;->B:I

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
    iput v1, v0, Lp34;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp34;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lp34;-><init>(Ls34;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lp34;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lp34;->B:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v4, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_1
    iput-boolean v4, p0, Ls34;->i:Z

    .line 52
    .line 53
    new-instance p2, Lq34;

    .line 54
    .line 55
    invoke-direct {p2, p0, p1, v2}, Lq34;-><init>(Ls34;ILf61;)V

    .line 56
    .line 57
    .line 58
    iput v4, v0, Lp34;->B:I

    .line 59
    .line 60
    sget-object p1, Lhq4;->w:Lhq4;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2, v0}, Ls34;->d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    sget-object p2, Lp81;->w:Lp81;

    .line 67
    .line 68
    if-ne p1, p2, :cond_3

    .line 69
    .line 70
    return-object p2

    .line 71
    :cond_3
    :goto_1
    iput-boolean v3, p0, Ls34;->i:Z

    .line 72
    .line 73
    sget-object p0, Lvs7;->a:Lvs7;

    .line 74
    .line 75
    return-object p0

    .line 76
    :goto_2
    iput-boolean v3, p0, Ls34;->i:Z

    .line 77
    .line 78
    throw p1
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
.end method

.method public final g(Lm34;ZZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lm34;->k:Ljava/util/List;

    .line 6
    .line 7
    iget v3, v1, Lm34;->n:I

    .line 8
    .line 9
    iget v4, v1, Lm34;->b:I

    .line 10
    .line 11
    iget-object v5, v1, Lm34;->a:Ln34;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v7, v0, Ls34;->q:Lt24;

    .line 18
    .line 19
    iput v6, v7, Lt24;->e:I

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    iget-object v8, v0, Ls34;->x:Lhv2;

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    iget-object v10, v0, Ls34;->e:Lg04;

    .line 26
    .line 27
    const/4 v11, 0x1

    .line 28
    if-nez p2, :cond_3

    .line 29
    .line 30
    iget-boolean v12, v0, Ls34;->b:Z

    .line 31
    .line 32
    if-eqz v12, :cond_3

    .line 33
    .line 34
    iput-object v1, v0, Ls34;->c:Lm34;

    .line 35
    .line 36
    invoke-static {}, Lj45;->h()Lix6;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Lix6;->e()Lvr2;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    :cond_0
    invoke-static {v1}, Lj45;->j(Lix6;)Lix6;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :try_start_0
    iget-object v0, v8, Lhv2;->x:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lil;

    .line 53
    .line 54
    iget-object v0, v0, Lil;->x:Led5;

    .line 55
    .line 56
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    cmpg-float v0, v0, v6

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    move v7, v11

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v7, 0x0

    .line 73
    :goto_0
    if-nez v7, :cond_2

    .line 74
    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    iget v0, v5, Ln34;->a:I

    .line 78
    .line 79
    iget-object v3, v10, Lg04;->b:Lbd5;

    .line 80
    .line 81
    invoke-virtual {v3}, Lbd5;->d()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ne v0, v3, :cond_2

    .line 86
    .line 87
    iget-object v0, v10, Lg04;->c:Lbd5;

    .line 88
    .line 89
    invoke-virtual {v0}, Lbd5;->d()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-ne v4, v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {v8}, Lhv2;->Z0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    :goto_1
    invoke-static {v1, v2, v9}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_2
    invoke-static {v1, v2, v9}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_3
    if-eqz p2, :cond_4

    .line 110
    .line 111
    iput-boolean v11, v0, Ls34;->b:Z

    .line 112
    .line 113
    :cond_4
    if-eqz v5, :cond_5

    .line 114
    .line 115
    iget v12, v5, Ln34;->a:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    const/4 v12, 0x0

    .line 119
    :goto_3
    if-nez v12, :cond_7

    .line 120
    .line 121
    if-eqz v4, :cond_6

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    const/4 v12, 0x0

    .line 125
    goto :goto_5

    .line 126
    :cond_7
    :goto_4
    move v12, v11

    .line 127
    :goto_5
    iget-object v13, v0, Ls34;->v:Led5;

    .line 128
    .line 129
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v13, v12}, Led5;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-boolean v12, v1, Lm34;->c:Z

    .line 137
    .line 138
    iget-object v13, v0, Ls34;->u:Led5;

    .line 139
    .line 140
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    invoke-virtual {v13, v12}, Led5;->setValue(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget v12, v0, Ls34;->h:F

    .line 148
    .line 149
    iget v13, v1, Lm34;->d:F

    .line 150
    .line 151
    sub-float/2addr v12, v13

    .line 152
    iput v12, v0, Ls34;->h:F

    .line 153
    .line 154
    iget-object v12, v0, Ls34;->f:Led5;

    .line 155
    .line 156
    invoke-virtual {v12, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const-string v12, "scrollOffset should be non-negative"

    .line 160
    .line 161
    if-eqz p3, :cond_9

    .line 162
    .line 163
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    int-to-float v0, v4

    .line 167
    cmpl-float v0, v0, v6

    .line 168
    .line 169
    if-ltz v0, :cond_8

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_8
    invoke-static {v12}, Lbc3;->c(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_6
    iget-object v0, v10, Lg04;->c:Lbd5;

    .line 176
    .line 177
    invoke-virtual {v0, v4}, Lbd5;->e(I)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_e

    .line 181
    .line 182
    :cond_9
    invoke-static {v2}, Ldt0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    check-cast v13, Ln34;

    .line 187
    .line 188
    invoke-static {v2}, Ldt0;->H0(Ljava/util/List;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    check-cast v14, Ln34;

    .line 193
    .line 194
    const-wide/16 v15, -0x1

    .line 195
    .line 196
    if-eqz v13, :cond_a

    .line 197
    .line 198
    iget v13, v13, Ln34;->a:I

    .line 199
    .line 200
    move/from16 v17, v6

    .line 201
    .line 202
    int-to-long v6, v13

    .line 203
    goto :goto_7

    .line 204
    :cond_a
    move/from16 v17, v6

    .line 205
    .line 206
    move-wide v6, v15

    .line 207
    :goto_7
    const-string v13, "firstVisibleItem:index"

    .line 208
    .line 209
    invoke-static {v6, v7, v13}, Lag8;->L(JLjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    if-eqz v14, :cond_b

    .line 213
    .line 214
    iget v6, v14, Ln34;->a:I

    .line 215
    .line 216
    int-to-long v6, v6

    .line 217
    goto :goto_8

    .line 218
    :cond_b
    move-wide v6, v15

    .line 219
    :goto_8
    const-string v13, "lastVisibleItem:index"

    .line 220
    .line 221
    invoke-static {v6, v7, v13}, Lag8;->L(JLjava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    if-eqz v5, :cond_c

    .line 228
    .line 229
    iget-object v6, v5, Ln34;->i:Ljava/lang/Object;

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_c
    move-object v6, v9

    .line 233
    :goto_9
    iput-object v6, v10, Lg04;->e:Ljava/lang/Object;

    .line 234
    .line 235
    iget-boolean v6, v10, Lg04;->d:Z

    .line 236
    .line 237
    if-nez v6, :cond_d

    .line 238
    .line 239
    if-lez v3, :cond_10

    .line 240
    .line 241
    :cond_d
    iput-boolean v11, v10, Lg04;->d:Z

    .line 242
    .line 243
    int-to-float v6, v4

    .line 244
    cmpl-float v6, v6, v17

    .line 245
    .line 246
    if-ltz v6, :cond_e

    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_e
    invoke-static {v12}, Lbc3;->c(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_a
    if-eqz v5, :cond_f

    .line 253
    .line 254
    iget v5, v5, Ln34;->a:I

    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_f
    const/4 v5, 0x0

    .line 258
    :goto_b
    invoke-virtual {v10, v5, v4}, Lg04;->a(II)V

    .line 259
    .line 260
    .line 261
    :cond_10
    iget-boolean v4, v0, Ls34;->k:Z

    .line 262
    .line 263
    if-eqz v4, :cond_16

    .line 264
    .line 265
    iget-object v4, v0, Ls34;->a:Llm1;

    .line 266
    .line 267
    iget v5, v4, Llm1;->a:I

    .line 268
    .line 269
    iget-boolean v6, v4, Llm1;->b:Z

    .line 270
    .line 271
    const/4 v7, -0x1

    .line 272
    if-eq v5, v7, :cond_12

    .line 273
    .line 274
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    if-nez v10, :cond_12

    .line 279
    .line 280
    invoke-static {v1, v6}, Llm1;->a(Lm34;Z)I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-eq v5, v6, :cond_12

    .line 285
    .line 286
    iput v7, v4, Llm1;->a:I

    .line 287
    .line 288
    iget-object v5, v4, Llm1;->e:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v5, Ls24;

    .line 291
    .line 292
    if-eqz v5, :cond_11

    .line 293
    .line 294
    invoke-interface {v5}, Ls24;->cancel()V

    .line 295
    .line 296
    .line 297
    :cond_11
    iput-object v9, v4, Llm1;->e:Ljava/lang/Object;

    .line 298
    .line 299
    :cond_12
    iget v5, v4, Llm1;->c:I

    .line 300
    .line 301
    if-eq v5, v7, :cond_15

    .line 302
    .line 303
    iget v6, v4, Llm1;->d:F

    .line 304
    .line 305
    cmpg-float v6, v6, v17

    .line 306
    .line 307
    if-nez v6, :cond_13

    .line 308
    .line 309
    goto :goto_d

    .line 310
    :cond_13
    if-eq v5, v3, :cond_15

    .line 311
    .line 312
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-nez v2, :cond_15

    .line 317
    .line 318
    iget v2, v4, Llm1;->d:F

    .line 319
    .line 320
    cmpg-float v2, v2, v17

    .line 321
    .line 322
    if-gez v2, :cond_14

    .line 323
    .line 324
    move v7, v11

    .line 325
    goto :goto_c

    .line 326
    :cond_14
    const/4 v7, 0x0

    .line 327
    :goto_c
    invoke-static {v1, v7}, Llm1;->a(Lm34;Z)I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-ltz v2, :cond_15

    .line 332
    .line 333
    if-ge v2, v3, :cond_15

    .line 334
    .line 335
    iput v2, v4, Llm1;->a:I

    .line 336
    .line 337
    iget-object v0, v0, Ls34;->r:Lns8;

    .line 338
    .line 339
    invoke-static {v0, v2}, Lns8;->V(Lns8;I)Ls24;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-object v0, v4, Llm1;->e:Ljava/lang/Object;

    .line 344
    .line 345
    :cond_15
    :goto_d
    iput v3, v4, Llm1;->c:I

    .line 346
    .line 347
    :cond_16
    :goto_e
    if-eqz p2, :cond_17

    .line 348
    .line 349
    iget v0, v1, Lm34;->f:F

    .line 350
    .line 351
    iget-object v2, v1, Lm34;->i:Ltp1;

    .line 352
    .line 353
    iget-object v1, v1, Lm34;->h:Lo81;

    .line 354
    .line 355
    invoke-virtual {v8, v0, v2, v1}, Lhv2;->b1(FLtp1;Lo81;)V

    .line 356
    .line 357
    .line 358
    :cond_17
    return-void
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
.end method

.method public final h()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->e:Lg04;

    .line 2
    .line 3
    iget-object p0, p0, Lg04;->b:Lbd5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbd5;->d()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
.end method

.method public final i()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->e:Lg04;

    .line 2
    .line 3
    iget-object p0, p0, Lg04;->c:Lbd5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbd5;->d()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
.end method

.method public final j()Lm34;
    .locals 0

    .line 1
    iget-object p0, p0, Ls34;->f:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lm34;

    .line 8
    .line 9
    return-object p0
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
.end method

.method public final k(FLm34;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ls34;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, Lm34;->k:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Ls34;->a:Llm1;

    .line 12
    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    cmpg-float v0, p1, v0

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-static {p2, v0}, Llm1;->a(Lm34;Z)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_5

    .line 28
    .line 29
    iget v3, p2, Lm34;->n:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_5

    .line 32
    .line 33
    iget v3, v1, Llm1;->a:I

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    iget-boolean v3, v1, Llm1;->b:Z

    .line 38
    .line 39
    if-eq v3, v0, :cond_2

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    iput v3, v1, Llm1;->a:I

    .line 43
    .line 44
    iget-object v3, v1, Llm1;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ls24;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ls24;->cancel()V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v3, 0x0

    .line 54
    iput-object v3, v1, Llm1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_2
    iput-boolean v0, v1, Llm1;->b:Z

    .line 57
    .line 58
    iput v2, v1, Llm1;->a:I

    .line 59
    .line 60
    iget-object p0, p0, Ls34;->r:Lns8;

    .line 61
    .line 62
    invoke-static {p0, v2}, Lns8;->V(Lns8;I)Ls24;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iput-object p0, v1, Llm1;->e:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_3
    iget-object p0, p2, Lm34;->k:Ljava/util/List;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    invoke-static {p0}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ln34;

    .line 77
    .line 78
    iget v0, p2, Lm34;->q:I

    .line 79
    .line 80
    iget v2, p0, Ln34;->l:I

    .line 81
    .line 82
    iget p0, p0, Ln34;->m:I

    .line 83
    .line 84
    add-int/2addr v2, p0

    .line 85
    add-int/2addr v2, v0

    .line 86
    iget p0, p2, Lm34;->m:I

    .line 87
    .line 88
    sub-int/2addr v2, p0

    .line 89
    int-to-float p0, v2

    .line 90
    neg-float p2, p1

    .line 91
    cmpg-float p0, p0, p2

    .line 92
    .line 93
    if-gez p0, :cond_5

    .line 94
    .line 95
    iget-object p0, v1, Llm1;->e:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ls24;

    .line 98
    .line 99
    if-eqz p0, :cond_5

    .line 100
    .line 101
    invoke-interface {p0}, Ls24;->a()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-static {p0}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ln34;

    .line 110
    .line 111
    iget p2, p2, Lm34;->l:I

    .line 112
    .line 113
    iget p0, p0, Ln34;->l:I

    .line 114
    .line 115
    sub-int/2addr p2, p0

    .line 116
    int-to-float p0, p2

    .line 117
    cmpg-float p0, p0, p1

    .line 118
    .line 119
    if-gez p0, :cond_5

    .line 120
    .line 121
    iget-object p0, v1, Llm1;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Ls24;

    .line 124
    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    invoke-interface {p0}, Ls24;->a()V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_1
    iput p1, v1, Llm1;->d:F

    .line 131
    .line 132
    :cond_6
    return-void
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

.method public final m(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls34;->e:Lg04;

    .line 2
    .line 3
    iget-object v1, v0, Lg04;->b:Lbd5;

    .line 4
    .line 5
    invoke-virtual {v1}, Lbd5;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Lg04;->c:Lbd5;

    .line 13
    .line 14
    invoke-virtual {v1}, Lbd5;->d()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Ls34;->o:Lwz0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lwz0;->h()V

    .line 23
    .line 24
    .line 25
    iput-object v2, v1, Lwz0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, p1, v1}, Lg04;->a(II)V

    .line 29
    .line 30
    .line 31
    iput-object v2, v0, Lg04;->e:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object p0, p0, Ls34;->l:Luy3;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Luy3;->k()V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
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
.end method
