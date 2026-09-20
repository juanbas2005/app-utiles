.class public final synthetic Lmu7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ly97;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lza6;


# direct methods
.method public synthetic constructor <init>(Lza6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmu7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lmu7;->x:Lza6;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final f()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lmu7;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lmu7;->x:Lza6;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lza6;->x:Les0;

    .line 10
    .line 11
    invoke-interface {v0}, Les0;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v0, p0, Lza6;->z:Lq00;

    .line 16
    .line 17
    iget-wide v4, v0, Lq00;->d:J

    .line 18
    .line 19
    sub-long/2addr v2, v4

    .line 20
    invoke-virtual {p0}, Lza6;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    const-string v4, "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    filled-new-array {v2}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 38
    .line 39
    .line 40
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :goto_0
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    int-to-long v6, v4

    .line 57
    sget-object v4, Lsb4;->y:Lsb4;

    .line 58
    .line 59
    invoke-virtual {p0, v6, v7, v4, v5}, Lza6;->u(JLsb4;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 64
    .line 65
    .line 66
    const-string p0, "events"

    .line 67
    .line 68
    const-string v1, "timestamp_ms < ?"

    .line 69
    .line 70
    invoke-virtual {v0, p0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 89
    .line 90
    .line 91
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    :goto_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget v0, Lur0;->e:I

    .line 100
    .line 101
    new-instance v0, Lam6;

    .line 102
    .line 103
    const/4 v2, 0x6

    .line 104
    invoke-direct {v0, v2, v1}, Lam6;-><init>(IZ)V

    .line 105
    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    iput-object v2, v0, Lam6;->y:Ljava/lang/Object;

    .line 109
    .line 110
    new-instance v3, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v3, v0, Lam6;->z:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v2, v0, Lam6;->A:Ljava/lang/Object;

    .line 118
    .line 119
    const-string v2, ""

    .line 120
    .line 121
    iput-object v2, v0, Lam6;->x:Ljava/lang/Object;

    .line 122
    .line 123
    new-instance v2, Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v3, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"

    .line 129
    .line 130
    invoke-virtual {p0}, Lza6;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 135
    .line 136
    .line 137
    :try_start_4
    new-array v1, v1, [Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v4, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v3, Lyz0;

    .line 144
    .line 145
    const/16 v5, 0x8

    .line 146
    .line 147
    invoke-direct {v3, p0, v2, v0, v5}, Lyz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v3}, Lza6;->D(Landroid/database/Cursor;Lxa6;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Lur0;

    .line 155
    .line 156
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :catchall_2
    move-exception p0

    .line 164
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 170
    .line 171
    .line 172
.end method
