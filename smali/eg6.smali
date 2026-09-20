.class public interface abstract Leg6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# virtual methods
.method public a()Ljava/util/Map;
    .locals 0

    .line 1
    invoke-interface {p0}, Leg6;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldt0;->H0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcu4;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lcu4;->c:Ljava/util/Map;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p0

    .line 19
    :cond_1
    :goto_0
    sget-object p0, Lb42;->w:Lb42;

    .line 20
    .line 21
    return-object p0
.end method

.method public abstract b()Ljava/util/List;
.end method

.method public abstract c()Ljava/util/List;
.end method

.method public abstract getContent()Lfw0;
.end method

.method public abstract getKey()Ljava/lang/Object;
.end method
